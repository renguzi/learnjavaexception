package com.imooc.ioc.demo2;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-14
 * @Description: demo2
 * @Version:1.0
 */
public class Bean2StaticFactory {

    public static Bean2 createBean2ByStaticMethod() {
        System.out.println("Bean2的静态工厂方法被执行了");
        return new Bean2();
    }
}
