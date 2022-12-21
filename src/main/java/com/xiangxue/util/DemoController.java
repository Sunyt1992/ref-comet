package com.xiangxue.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @projectName: ref-comet
 * @package: com.xiangxue.util
 * @className: DemoController
 * @author: sunyingtao
 * @description: TODO
 * @date: 2022/12/21 22:52
 * @version: 1.0
 */
@Controller
@RequestMapping("/demoController")
public class DemoController {

    @Autowired
    @Qualifier("demoServiceImpl")
    private DemoService demoService;

    @RequestMapping("demo")
    public void demo(){
        demoService.demo();
    }
}
