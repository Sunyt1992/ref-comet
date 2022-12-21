package com.xiangxue.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @projectName: ref-comet
 * @package: com.xiangxue.util
 * @className: DemoServiceImpl
 * @author: sunyingtao
 * @description: TODO
 * @date: 2022/12/21 22:50
 * @version: 1.0
 */
@Service("demoServiceImpl")
@Primary
public class DemoServiceImpl implements DemoService {
    @Override
    public void demo() {

    }
}
