package com.darren.comm.base.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础实体类
 * 
 * @author zhangpanfeng
 * 
 */
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -7982965810132366752L;
    /**
     * 创建时间
     */
    protected Date createTime;
    /**
     * 更新时间
     */
    protected Date updateTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
