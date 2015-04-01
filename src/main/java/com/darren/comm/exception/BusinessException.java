package com.darren.comm.exception;

public class BusinessException extends Exception {
    private static final long serialVersionUID = 5632708980681492819L;
    private String code;
    private String message;

    public BusinessException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BusinessException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("异常代码：[" + this.code + "] ").append("异常消息：[" + this.message + "]");

        return builder.toString();
    }
}
