package com.yqz.zzh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@MapperScan(value = "com.yqz.zzh.mapper")
public class CcmlApplication {
    public static void main(String[] args) {
        SpringApplication.run(CcmlApplication.class, args);
    }
}
