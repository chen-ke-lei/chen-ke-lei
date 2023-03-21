package com.example.faststart.base.exception;

import lombok.Data;

@Data
public class BizException extends Exception{
    private int code;
    private String name;

}
