package com.example.faststart.base.template;

import com.example.faststart.base.constants.RespCodeEnum;
import com.example.faststart.base.exception.BizException;
import com.example.faststart.base.req.ReqBean;
import com.example.faststart.base.resp.RespMsgBean;
import com.example.faststart.base.template.function.BizCallBack;
import com.example.faststart.base.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public  class BizTemplate<T> {
     public RespMsgBean<T> execute(ReqBean req, BizCallBack<T> callBack){
         try {
             return callBack.callBack(req);
         }catch (BizException bizException){
             log.error("service execute Error,req is {},biz error is {}", JsonUtil.toJsonStr(req),JsonUtil.toJsonStr(bizException.getName()));
             return new RespMsgBean<>().failure(RespCodeEnum.FAILURE.getCode(),bizException.getMessage());
         } catch (Exception e){
             log.error("service execute Error req is err is {}",JsonUtil.toJsonStr(req),JsonUtil.toJsonStr(e.getMessage()));
             return new RespMsgBean<>().failure(RespCodeEnum.FAILURE.getCode(),e.getMessage());
         }

     }
}
