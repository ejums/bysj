package com.nicetest.library.mapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

/**
 * @author hjm09
 */
public interface BaseMapper<T> {
    /**
     * @param specification specification
     * @return t
     */
    long count(Specification<T> specification);

    /**
     * @param specification specification
     * @param pageable pageable
     * @return data
     */
    Page<T> findAll(Specification<T> specification, Pageable pageable);
}
