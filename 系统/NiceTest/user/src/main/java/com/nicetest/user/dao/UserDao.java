package com.nicetest.user.dao;

import com.nicetest.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hjm09
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer>{
    /**
     * get user by username;
     * @param username username
     * @return user
     */
    User findByUsername(String username);
}
