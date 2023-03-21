package com.example.faststart.base.resp;

import com.example.faststart.base.constants.RespCodeEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RespMsgBean<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String FALLBAKC  = "fallback";

    /**
     * 数据
     * */
    public T data;

    /**
     * 非0代码请求响应成功!
     * 0代表请求响应失败!
     */
    private int code;

    /**
     * 消息提示
     */
    private String msg;

    /**
     * 处理时间
     */
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private String nowTime= simpleDateFormat.format(new Date());

    public RespMsgBean(){}

    public RespMsgBean(T t){
        success();
        this.data = t;
    }

    public RespMsgBean(int code){
        this.code = code;
    }

    public RespMsgBean(int code,String msg){
        this(code);
        this.msg = msg;
    }

    public RespMsgBean(int code,String msg,T data){
        this(code);
        this.msg = msg;
        this.data = data;
    }

    public RespMsgBean success(){
        success(RespCodeEnum.SUCCESS.getCode());
        this.msg = RespCodeEnum.SUCCESS.getName();
        return this;
    }

    public RespMsgBean success(int code){
        this.code = code;
        this.msg = RespCodeEnum.SUCCESS.getName();
        return this;
    }

    public RespMsgBean success(String msg){
        success();
        this.msg = msg;
        return this;
    }

    public RespMsgBean success(String msg, T data){
        success();
        success(msg);
        this.data = data;
        return this;
    }

    public RespMsgBean success(int code, String msg){
        success(code);
        success(msg);
        return this;
    }

    public RespMsgBean success(int code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
        return this;
    }

    public RespMsgBean success(T data){
        success();
        this.data = data;
        setData(data);
        return this;
    }

    public RespMsgBean failure(T data){
        failure();
        this.data = data;
        setData(data);
        return this;
    }

    public RespMsgBean failure(){
        failure(RespCodeEnum.FAILURE.getCode());
        return this;
    }

    public RespMsgBean failure(int code){
        this.code= code;
        this.msg = RespCodeEnum.FAILURE.getName();
        return this;
    }

    public RespMsgBean failure(String msg){
        failure(RespCodeEnum.FAILURE.getCode());
        this.msg = msg != null ? msg:RespCodeEnum.FAILURE.getName();
        return this;
    }

    public RespMsgBean failure(RespCodeEnum  respCodeEnum){
        failure(respCodeEnum.getCode());
        this.msg = respCodeEnum.getName();
        return this;
    }

    public RespMsgBean fallback(RespCodeEnum respCodeEnum, String msg){
        failure(respCodeEnum);
        this.msg = msg;
        return this;
    }

    public RespMsgBean fallback(String msg){
        fallback(RespCodeEnum.FAILURE,null == msg ?FALLBAKC:msg);
        return this;
    }

    public RespMsgBean fallback(){
        success();
        this.msg = FALLBAKC;
        return this;
    }

    public RespMsgBean fallback(T data){
        fallback();
        this.data = data;
        return this;
    }


    public RespMsgBean failure(int code, String msg){
        failure(code);
        this.msg = msg;
        return this;
    }

    public RespMsgBean failure(String msg, T data){
        failure(msg);
        this.data = data;
        return this;
    }

    public RespMsgBean failure(int code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
        return this;
    }

    public String getNowTime() {
        return nowTime;
    }

    public void setNowTime(String nowTime) {
        this.nowTime = nowTime;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @JsonIgnore
    public boolean isSuccess(){
        return this.getCode() == RespCodeEnum.SUCCESS.getCode();
    }
}
