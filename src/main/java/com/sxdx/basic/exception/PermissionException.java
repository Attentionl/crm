package com.sxdx.basic.exception;

/**
 * @author 李今朝
 * @className PermissionException
 * @version1.0
 * @description 权限不足异常
 * @createdTime 2020/2/12 22:34
 */
public class PermissionException extends CustomerException {
    public PermissionException() {
    }

    public PermissionException(String message) {
        super(message);
    }

    public PermissionException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionException(Throwable cause) {
        super(cause);
    }

    public PermissionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
