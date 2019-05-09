package com.nicetest.user.dao;

import com.nicetest.user.entity.LoginRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hjm09
 */
@Repository
public interface LoginRecordDao extends JpaRepository<LoginRecord, Integer> {
    /**
     * 根据时间和用户id查找登陆记录
     * @param userId userId
     * @param loginTime loginTime
     * @param pageable pageable
     * @param sort sort
     * @return List<LoginRecord>
     */
//    List<LoginRecord> findAllByUserIdAndLoginTimeBefore(Integer userId,
//                                                        LocalDateTime loginTime, Pageable pageable, Sort sort);
}
