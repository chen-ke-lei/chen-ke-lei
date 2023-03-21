package com.example.faststart.base.constants;

public enum StatusEnum {
    Delete(-1,"删除"),
    Available(0,"可用"),
    Lock (1,"锁定")
    ;
    private int code;
    private String name;

     StatusEnum(int code,String name){
        this.code=code;
        this.name=name;
    }

    public int getCode() {
        return code;
    }
    public String getName(){
         return name;
    }
}
