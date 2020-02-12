package com.sxdx.basic.exception;

/**
 * @author 李今朝
 * @className UnAuthorizedException
 * @version1.0
 * @description 用户未登录异常
 * @createdTime 2020/2/12 22:35
 */
public class UnAuthorizedException extends CustomerException {
    public UnAuthorizedException() {
    }

    public UnAuthorizedException(String message) {
        super(message);
    }

    public UnAuthorizedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnAuthorizedException(Throwable cause) {
        super(cause);
    }

    public UnAuthorizedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}