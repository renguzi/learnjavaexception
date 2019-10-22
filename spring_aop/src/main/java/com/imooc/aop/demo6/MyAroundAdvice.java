package com.imooc.aop.demo6;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-21
 * @Description: com.imooc.aop.demo4
 * @Version:1.0
 */
public class MyAroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("环绕前增强....");
        Object object= methodInvocation.proceed();
        System.out.println("环绕后增强....");
        return object;
    }
}
