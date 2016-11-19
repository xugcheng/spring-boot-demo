package com.xugc.index.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/11/19.
 */
public class Result<T> implements Serializable {

    public static final Integer OK = 0;
    public static final Integer ERROR = 100;

    private Integer code;

    private String message;

    private String url;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", url='" + url + '\'' +
                ", data=" + data +
                '}';
    }
}
