package com.xiangxue.singleton;

/**
 * @projectName: ref-comet
 * @package: com.xiangxue.singleton
 * @className: Singleton
 * @author: sunyingtao
 * @description: 双重锁
 * @date: 2022/11/29 21:53
 * @version: 1.0
 */
public class Singleton {
    //构造函数私有化
    private Singleton() {

    }
    private static Singleton singleton = null;

    public static Singleton getSingleton(){
        //先检查实例是否存在，如果不存在才执行下面语句进行创建实例
        if(singleton == null){
            //加锁，线程安全的创建实例
            synchronized (Singleton.class){
                if(singleton == null){
                    //再次检查实例是否存在，还是不存在才进行创建实例
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
