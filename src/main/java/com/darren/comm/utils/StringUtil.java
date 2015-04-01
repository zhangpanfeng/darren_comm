package com.darren.comm.utils;

public class StringUtil {
    /**
     * 判读字符串是否为""或null， ""或null返回true，否则返回false
     * 
     * @param source
     *            参数
     * @return true/false
     */
    public static boolean isEmpty(String source) {
        if (source == null || "".equals(source)) {
            return true;
        } else {
            return false;
        }
    }
}
