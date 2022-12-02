package com.xiangxue.simplefactory;

/**
 * @projectName: ref-comet
 * @package: com.xiangxue.simplefactory
 * @className: BaoMaFactory
 * @author: sunyingtao
 * @description: TODO
 * @date: 2022/12/1 16:39
 * @version: 1.0
 */
public class BaoMaFactory implements AbstractFactory{
    @Override
    public Car driver() {
        return new BaoMa();
    }
}
