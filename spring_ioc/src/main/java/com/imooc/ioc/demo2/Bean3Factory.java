package com.imooc.ioc.demo2;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-15
 * @Description: com.imooc.ioc.demo2
 * @Version:1.0
 */
public class Bean3Factory {
    public Bean3 createBean3() {
        System.out.println("Bean3的工厂方法被执行了");
        return new Bean3();
    }
}
