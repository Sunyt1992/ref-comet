package com.xiangxue.util;

import org.springframework.stereotype.Service;

/**
 * @projectName: ref-comet
 * @package: com.xiangxue.util
 * @className: DemoServiceImpl2
 * @author: sunyingtao
 * @description: TODO
 * @date: 2022/12/21 22:51
 * @version: 1.0
 */
@Service("demoServiceImpl2")
public class DemoServiceImpl2 implements DemoService {
    @Override
    public void demo() {
        System.out.println("添加一个打印");
        System.out.println("第二次提交");

        System.out.println("dev环境第一次提交");
        System.out.println("dev环境第2次提交");

    }
}
