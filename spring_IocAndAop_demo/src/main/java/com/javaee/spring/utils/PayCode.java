package com.javaee.spring.utils;

public enum PayCode {
	SUCCESS(200, "success"),
    FAIL(404, "fail"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误");

    private final int code;
    private final String message;

    // 枚举的构造函数默认是私有的
    PayCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
