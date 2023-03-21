package com.example.faststart.base.controller;

import com.example.faststart.base.resp.RespMsgBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseController {
    private static final Logger logger= LoggerFactory.getLogger(BaseController.class);

    protected static final String SUCCESS = "操作成功";

    protected static final String UPDATE_SUCCESS = "更新成功";

    protected static final String SAVE_SUCCESS = "保存成功";

    protected static final String FIND_SUCCESS = "查询成功";

    protected static final String DELETE_SUCCESS = "删除成功";

    protected static final String FAILURE = "操作失败";

    protected static final String UPDATE_FAILURE = "更新失败";

    protected static final String SAVE_FAILURE = "保存失败";

    protected static final String FIND_FAILURE = "查询失败";

    protected static final String DELETE_FAILURE = "删除失败";

    protected static final String IMPORT_FAILURE = "导入失败";

    public RespMsgBean success() {
        return new RespMsgBean().success();
    }

    public RespMsgBean success(Integer code) {
        return new RespMsgBean().success(code);
    }

    public RespMsgBean success(String msg) {
        return new RespMsgBean().success(msg);
    }

    public RespMsgBean success(Object data) {
        return new RespMsgBean().success(data);
    }

    public RespMsgBean success(Integer code, String msg) {
        return new RespMsgBean().success(code, msg);
    }

    public RespMsgBean success(String msg, Object data) {
        return new RespMsgBean().success(msg, data);
    }

    public RespMsgBean success(Integer code, String msg, Object data) {
        return new RespMsgBean().success(code, msg, data);
    }

    public RespMsgBean failure() {
        return new RespMsgBean().failure();
    }

    public RespMsgBean failure(Integer code) {
        return new RespMsgBean().failure(code);
    }

    public RespMsgBean failure(String msg) {
        return new RespMsgBean().failure(msg);
    }

    public RespMsgBean failure(Object data) {
        return new RespMsgBean().failure(data);
    }

    public RespMsgBean failure(Integer code, String msg) {
        return new RespMsgBean().failure(code, msg);
    }

    public RespMsgBean failure(String msg, Object data) {
        return new RespMsgBean().failure(msg, data);
    }

    public RespMsgBean failure(Integer code, String msg, Object data) {
        return new RespMsgBean().failure(code, msg, data);
    }

}
