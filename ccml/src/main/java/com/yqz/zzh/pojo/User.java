package com.yqz.zzh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zzh
 * @Description
 * @date 2020-05-23 22:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String id;

    private String userName;

    private String password;

    private String imgUrl;

    private String createTime;
}
