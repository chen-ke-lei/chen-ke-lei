package com.example.faststart.controller;

import com.example.faststart.base.controller.BaseController;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExampleController extends BaseController {
    //------spring security 相关---------------
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteItem(String item) {
        //删除商品代码
    }

    @PostAuthorize("returnObject.owner == authentication.name")
    public List<String> getItem(Long id) {
        //获取商品代码
        return null;
    }
}