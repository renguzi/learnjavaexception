package com.imooc.ioc.com.imooc.ioc.beanlifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-16
 * @Description: com.imooc.ioc.com.imooc.ioc.beanlifecycle
 * @Version:1.0
 */
public class BeanLifecycleTest {

    @Test
    public void lifecycledemo() {
        //    创建工厂
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过工厂获得类的实例
        BeanLifecylce beanlifecycle = (BeanLifecylce) applicationContext.getBean("beanlifecycle");
        beanlifecycle.run();

//        正常情况下，是看不到销毁方法的。如果需要看到销毁方法被执行的话，就需要通过实现类ClassPathXmlApplicationContext的close()方法才看到，
//        所以，把前面的接口ApplicationContext改为其实现类了
        applicationContext.close();
    }

}
