package com.darren.comm.vo;

public class ClientMessage {
    /**
     * 消息
     */
    private String message;
    /**
     * 跳转链接
     */
    private String href;
    /**
     * 跳转目标名称
     */
    private String target;
    /**
     * 错误码
     */
    private String errorCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

}
