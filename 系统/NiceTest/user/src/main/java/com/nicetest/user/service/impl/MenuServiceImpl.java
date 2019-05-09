package com.nicetest.user.service.impl;

import com.nicetest.user.dao.MenuDao;
import com.nicetest.user.entity.Menu;
import com.nicetest.user.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author hjm09
 */
@Service
@SuppressWarnings({"Unchecked"})
public class MenuServiceImpl implements MenuService {
    private final MenuDao menuDao;

    @Autowired
    public MenuServiceImpl(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    @Override
    public List list(String username) {
        List<Menu> list = menuDao.findAll();
        Map<Integer,List<Map<String,Object>>> maps = new HashMap<>();
        list.forEach((m)->{
            List<Map<String, Object>> temp = maps.get(m.getParentId());
            if(temp == null){
                temp = new ArrayList<>();
            }
            Map<String, Object> map = new HashMap<>();
            map.put("id", m.getId());
            map.put("name", m.getName());
            map.put("url", m.getUrl());
            map.put("icon", m.getIcon());
            map.put("parentId", m.getParentId());
            map.put("children", Collections.emptyList());
            temp.add(map);
            maps.put(m.getParentId(), temp);
        });
        List<Map<String, Object>> result =  maps.remove(0);
        result.forEach((m)->{
            int id = (int) m.get("id");
            List<Map<String, Object>> remove = maps.remove(id);
            if(remove == null){
                remove = Collections.emptyList();
            }
            m.put("children", remove);
        });
        maps.forEach((k,v)->{
            StringBuilder str = new StringBuilder();
            find(result, k, str, v);
        });
        return result;
    }

    public <T> void find(List<Map<String, Object>> list, int id, StringBuilder str, List<Map<String, Object>> value){
        for (int i = 0; i < list.size(); i++) {
            Map<String, Object> map = list.get(i);
            int id_ = (int) map.get("id");
            if(id == id_){
                str.append(i).append("!");
                map.put("children", value);
                return;
            } else if(map.containsKey("children")){
                str.append(i).append("+");
                List<Map<String, Object>> children = (List<Map<String, Object>>) map.get("children");
                if(children != null){
                    find(children,id, str, value);
                }
                if(!str.toString().endsWith("!")){
                    str.setLength(str.length()-2);
                }
            }
        }
    }
}
