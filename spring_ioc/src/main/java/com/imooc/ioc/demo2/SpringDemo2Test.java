package com.imooc.ioc.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-14
 * @Description:
 * @Version:1.0
 */
public class SpringDemo2Test {

    /**
     * 测试通过无参构造方法来初始化实例
     */
    @Test
    public void demo1() {
//        创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过工厂获得类的实例
        Bean1NoParConstructor bean1 = (Bean1NoParConstructor) applicationContext.getBean("bean1");
    }

    @Test
    public void demo2() {
//        创建工厂
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过工厂获得类的实例
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
    }

    @Test
    public void demo3() {
//        创建工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过工厂获得类实例
        Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
    }

}
