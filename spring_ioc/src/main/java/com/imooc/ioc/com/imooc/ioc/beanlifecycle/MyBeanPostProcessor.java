package com.imooc.ioc.com.imooc.ioc.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-16
 * @Description: com.imooc.ioc.com.imooc.ioc.beanlifecycle
 * @Version:1.0     这个类里面的2个方法，在每一个spring类实例化的时候，都会调用该类并执行该类中的方法
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        System.out.println("第五步，初始化前：postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {
        System.out.println("第八步，初始化后：postProcessAfterInitialization");
        return bean;
    }
}
