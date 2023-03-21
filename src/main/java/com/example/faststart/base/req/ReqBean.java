package com.example.faststart.base.req;

import com.example.faststart.base.model.User;
import lombok.Data;

import java.io.Serializable;
@Data
public class ReqBean<T> implements Serializable {
    T req;

    User user;
}
