package com.example.faststart.base.util;

import com.google.gson.Gson;

public class JsonUtil {
    private static final String errorFormat="{\"msg\":\"to json failed\",\"reason\":\"%s\"}";

    public static String toJsonStr(Object object){
        try {
            Gson gson=new Gson();
            String s = gson.toJson(object);
            return s;
        }catch (Exception e){
            return String.format(errorFormat,e.getMessage());
        }

    }
}
