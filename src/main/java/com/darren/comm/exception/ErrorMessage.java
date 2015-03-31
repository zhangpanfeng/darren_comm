package com.darren.comm.exception;

public class ErrorMessage {
    /**
     * 创建错误信息
     */
    public static final String CREATE_ERROR = "创建失败！";

    public static final String CREATE_ERROR(String methodName, Object param) {

        return CREATE_ERROR + " 方法名：<" + methodName + "> 参数：" + param;
    }

    /**
     * 读取错误信息
     */
    public static final String READ_ERROR = "读取失败！";

    public static final String READ_ERROR(String methodName, Object param) {

        return READ_ERROR + " 方法名：<" + methodName + "> 参数：" + param;
    }

    /**
     * 更新错误信息
     */
    public static final String UPDATE_ERROR = "更新失败！";

    public static final String UPDATE_ERROR(String methodName, Object param) {

        return UPDATE_ERROR + " 方法名：<" + methodName + "> 参数：" + param;
    }

    /**
     * 删除错误信息
     */
    public static final String DELETE_ERROR = "删除失败！";

    public static final String DELETE_ERROR(String methodName, Object param) {

        return DELETE_ERROR + " 方法名：<" + methodName + "> 参数：" + param;
    }
}
