package com.wp.webdemo.controller;

import com.wp.webdemo.req.LoginReq;
import com.wp.webdemo.resp.ResultEnum;
import com.wp.webdemo.resp.ResultResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 95 on 2017/3/17.
 */

@RestController
public class UserController {

    @RequestMapping(value = "/login",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultResponse login(@RequestBody LoginReq loginReq){
        String email =loginReq.getEmail();
        String password=loginReq.getPassword();
        if(email == null){
            return ResultEnum.paramNotExist("email");
        }
        if(password == null) {
            return ResultEnum.paramNotExist("password");
        }
        if(!email.equalsIgnoreCase("771910012@qq.com")||!password.equals("123456")){
            return ResultEnum.authNotAllow("用户名或密码错误");
        }
        return ResultEnum.success();
    }
}
