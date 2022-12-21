package com.xiangxue.simplefactory;

/**
 * @projectName: ref-comet
 * @package: com.xiangxue.simplefactory
 * @className: BenChiFactory
 * @author: sunyingtao
 * @description: TODO
 * @date: 2022/12/1 16:40
 * @version: 1.0
 */
public class BenChiFactory implements AbstractFactory{
    @Override
    public Car driver() {
        //sadf
        return new BenChi();
    }

}
