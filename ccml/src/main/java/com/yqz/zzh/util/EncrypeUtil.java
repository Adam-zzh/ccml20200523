package com.yqz.zzh.util;

import cn.hutool.crypto.SmUtil;

/**
 * @author zzh
 * @Description
 * @date 2020-05-24 22:51
 */
public class EncrypeUtil {
    /*
      *@Description 对密码进行摘要加密
      *@author zzh
      *@Param userName 用户名作为密钥
      *@return 
      **/
    public static String encrypeStr(String userName,String data){
        return SmUtil.hmacSm3(userName.getBytes()).digestHex(data,"utf-8");
    }
}
