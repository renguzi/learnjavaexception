package com.imooc.ioc.fuzashuxingzhuru;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-17
 * @Description: com.imooc.ioc.fuzashuxingzhuru
 * @Version:1.0
 */
public class CollectionBeanTest {
    @Test
    public void collectionbeantest() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean collectionbean = (CollectionBean) applicationContext.getBean("collectionbean");
        System.out.println(collectionbean);
    }
}
