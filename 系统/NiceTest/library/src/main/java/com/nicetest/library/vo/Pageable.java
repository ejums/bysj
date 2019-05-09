package com.nicetest.library.vo;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hjm09
 */
public class Pageable {
    private Integer page;
    private Integer size;
    private HashMap<String, String> sort;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public HashMap<String, String> getSort() {
        return sort;
    }

    public void setSort(HashMap<String, String> sort) {
        this.sort = sort;
    }

    public org.springframework.data.domain.Pageable toPageable(){
        if(sort==null || sort.size() == 0){
            return PageRequest.of(page, size);
        }else{
            ArrayList<Sort.Order> orders = new ArrayList<>();
            for(Map.Entry<String, String> entry : sort.entrySet()){
                if("desc".equalsIgnoreCase(entry.getValue())){
                    orders.add(Sort.Order.desc(entry.getKey()));
                }else if("asc".equalsIgnoreCase(entry.getValue())){
                    orders.add(Sort.Order.asc(entry.getKey()));
                }
            }
            return PageRequest.of(page, size, Sort.by(orders));
        }
    }
}
