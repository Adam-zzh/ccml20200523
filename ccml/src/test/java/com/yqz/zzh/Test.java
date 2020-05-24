package com.yqz.zzh;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zzh
 * @Description
 * @date 20200523-21:05:20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=CcmlApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//SpringBootTest.WebEnvironment.RANDOM_PORT经常和测试类中@LocalServerPort一起在注入属性时使用
public class Test {
//    @LocalServerPort
//    private  int port;

    @org.junit.Test
    public void printProperties(){
    }

}
