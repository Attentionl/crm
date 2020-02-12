package com.sxdx.basic.exception;

/**
 * @author 李今朝
 * @className CustomerException
 * @version1.0
 * @description 自定义异常类
 * @createdTime 2020/2/12 22:33
 */
public class CustomerException extends RuntimeException {
    public CustomerException() {
    }

    public CustomerException(String message) {
        super(message);
    }

    public CustomerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerException(Throwable cause) {
        super(cause);
    }

    public CustomerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
