package com.nicetest.user.dao;

import com.nicetest.user.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hjm09
 */
public interface MenuDao extends JpaRepository<Menu, Integer> {
}
