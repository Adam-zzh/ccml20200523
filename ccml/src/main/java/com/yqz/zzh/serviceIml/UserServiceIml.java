package com.yqz.zzh.serviceIml;

import com.yqz.zzh.mapper.UserMapper;
import com.yqz.zzh.pojo.User;
import com.yqz.zzh.service.UserService;
import com.yqz.zzh.util.EncrypeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zzh
 * @Description
 * @date 2020-05-23 22:38
 */
@Service
@Transactional
public class UserServiceIml implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    @Override
    public List<User> getUserByUserNameAndPwd(String username, String password) {
        String newpassword = EncrypeUtil.encrypeStr(username,password);
        return userMapper.getUserByUserNameAndPwd(username,newpassword);
    }
}
