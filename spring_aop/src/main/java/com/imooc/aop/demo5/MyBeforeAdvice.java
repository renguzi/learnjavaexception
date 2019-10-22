package com.imooc.aop.demo5;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-21
 * @Description: com.imooc.aop.demo2
 * @Version:1.0
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置增强=========");
    }
}
