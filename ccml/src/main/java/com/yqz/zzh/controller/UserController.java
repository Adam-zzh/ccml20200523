package com.yqz.zzh.controller;

import com.yqz.zzh.pojo.CommonResult;
import com.yqz.zzh.pojo.User;
import com.yqz.zzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zzh
 * @Description
 * @date 2020-05-23 22:34
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("login")
    public CommonResult login(String username,String password){
        CommonResult cr = new CommonResult();
        List<User> users =userService.getUserByUserNameAndPwd(username,password);
        if (users!=null&&users.size()>0){
            cr.setMsg("ok");
            cr.setSuccess(true);
        }else {
            cr.setMsg("用户名密码错误");
            cr.setSuccess(false);
        }
        return cr;
    }
}
