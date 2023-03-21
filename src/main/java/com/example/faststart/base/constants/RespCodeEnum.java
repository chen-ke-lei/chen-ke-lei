package com.example.faststart.base.constants;

public enum RespCodeEnum {
    /**
     * 操作成功
     */
    SUCCESS(0,"操作成功！"),
    /**
     * 操作失败
     */
    FAILURE(-1,"操作失败！"),

    /**
     * 系统异常
     * */
    SYSTEM_ERROR(100,"系统异常"),



    /**
     * 请求参数错误
     */
    PARAMETER_ERROR(300, "请求参数错误"),


    /**
     * 登录信息缺失或过期
     */
    NO_LOGIN(403, "登录信息缺失或过期"),

    /**
     * 权限不足
     *
     */
    NO_PERMISSION(410,"权限不足");
    /**
     * 名称
     * */
    private String name;

    /**
     * 类型
     * */
    private Integer code;


    private RespCodeEnum(Integer code, String name) {
        this.name = name;
        this.code = code;
    }

    /**
     * 静态获取name方法
     * */
    public static String getName(Integer type) {
        for (RespCodeEnum c : RespCodeEnum.values()) {
            if (c.getCode().equals(type)) {
                return c.name;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
