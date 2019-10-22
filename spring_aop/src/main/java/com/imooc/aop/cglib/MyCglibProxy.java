package com.imooc.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-21
 * @Description: com.imooc.aop.demo1.cglib
 * @Version:1.0
 */
public class MyCglibProxy implements MethodInterceptor {
    private ProductDao productDao;

    public MyCglibProxy(ProductDao productDao) {
        this.productDao=productDao;
    }

    public Object createProxy() {
//        1创建核心类
        Enhancer enhancer=new Enhancer();

//        2设置父类
        enhancer.setSuperclass(productDao.getClass());
//        3设置回调
        enhancer.setCallback(this);
//        4生成代理
        Object proxy= enhancer.create();
        return proxy;
    }


    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if("save".equals(method.getName())){
            System.out.println("权限校验");
            return methodProxy.invokeSuper(proxy,args);
        }
        return methodProxy.invokeSuper(proxy,args);
    }
}
