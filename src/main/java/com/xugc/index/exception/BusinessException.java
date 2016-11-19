package com.xugc.index.exception;

/**
 * Created by Administrator on 2016/11/19.
 */
public class BusinessException extends Exception {

    private String message;

    public BusinessException(String message) {
        super(message);
    }
}
