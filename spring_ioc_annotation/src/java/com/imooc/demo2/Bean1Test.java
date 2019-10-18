package com.imooc.demo2;

import org.junit.Test;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-18
 * @Description: com.imooc.demo2
 * @Version:1.0
 */
public class Bean1Test {
    @Test
    public void demo1() {
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
        bean1.say();

        applicationContext.close();
    }

    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
        Bean2 bean21= (Bean2) applicationContext.getBean("bean2");

        System.out.println(bean2 == bean21);
    }
}
