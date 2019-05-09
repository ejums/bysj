package com.nicetest.library.vo;

import com.nicetest.library.util.JSONUtil;

/**
 * @author hjm09
 */
public class PageableVO<T> {
    private Pageable pageable;
    private T data;

    public org.springframework.data.domain.Pageable getPageable() {
        return pageable.toPageable();
    }

    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSONUtil.stringify(this);
    }
}
