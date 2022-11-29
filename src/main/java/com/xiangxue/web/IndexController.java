package com.xiangxue.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *类说明：
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String hello(){
        byte[]  b1 = new byte[1*1024*1024]; //1M的大小
        return "index";
    }

}
