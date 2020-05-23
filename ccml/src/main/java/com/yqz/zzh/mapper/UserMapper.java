package com.yqz.zzh.mapper;

import com.yqz.zzh.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zzh
 * @Description
 * @date 2020-05-23 22:41
 */
@Repository
public interface UserMapper {
    public List<User> getUsers();
}
