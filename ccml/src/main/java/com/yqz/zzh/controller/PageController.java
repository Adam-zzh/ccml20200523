package com.yqz.zzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zzh
 * @Description
 * @date 2020-05-24 09:51
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("/{pageName}")
    public String goPage(@PathVariable("pageName") String pageName){
        return pageName;
    }
}
