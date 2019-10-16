package com.imooc.ioc.beanscope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-15
 * @Description: com.imooc.ioc.beanscope
 * @Version:1.0
 */
public class Bean3Test {
    @Test
            public void demo() {
//    创建工厂

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//    通过工厂获得类实例
        Bean3 bean3scope1 = (Bean3) applicationContext.getBean("bean3scope");
        Bean3 bean3scope2 = (Bean3) applicationContext.getBean("bean3scope");
        System.out.println(bean3scope1);
        System.out.println(bean3scope2);
    }
}
