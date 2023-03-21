package com.example.faststart.base.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BaseBean {
    /**
     * 唯一主键
     */
    private Long id;
    /**
     *  备注
     */
    private String description;

    /**
     * 状态
     */
    private int status;
    /**
     * 版本
     */
    private int version;
    /**
     * 创建者
     */
    private String creator;

    /**
     * 操作人
     */
    private String operator;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;


}
