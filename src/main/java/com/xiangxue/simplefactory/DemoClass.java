package com.xiangxue.simplefactory;

/**
 * @projectName: ref-comet
 * @package: com.xiangxue.simplefactory
 * @className: DemoClass
 * @author: sunyingtao
 * @description: TODO
 * @date: 2022/12/1 16:06
 * @version: 1.0
 */
public class DemoClass {
    public static void main(String[] args) {
        AbstractFactory driver1 = new BaoMaFactory();
        Car driverBaoMa = driver1.driver();
        driverBaoMa.driver();
        System.out.println("------------");
        AbstractFactory driver2 = new BenChiFactory();
        Car driverBenChi = driver2.driver();
        driverBenChi.driver();
        System.out.println("------------");
    }
}
