package com.yizhidou.paper.util;

import java.io.Serializable;


public class ResponseResult<T> implements Serializable {

    
	private static final long serialVersionUID = 1L;
	private Integer status;
    private String message;
    private T data;

    public ResponseResult() {
        super();
    }

    public ResponseResult(Integer status) {
        super();
        this.status = status;
    }

    public ResponseResult(Integer status, T data) {
        super();
        this.status = status;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
