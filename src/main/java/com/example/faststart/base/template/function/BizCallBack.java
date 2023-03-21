package com.example.faststart.base.template.function;

import com.example.faststart.base.exception.BizException;
import com.example.faststart.base.req.ReqBean;
import com.example.faststart.base.resp.RespMsgBean;

public interface BizCallBack<T> {
    RespMsgBean<T> callBack( ReqBean req) throws BizException;
}
