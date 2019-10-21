package com.imooc.aop.demo1;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-21
 * @Description: com.imooc.aop.demo1
 * @Version:1.0
 */
public class SpringDemo1 {
    @Test
    public void demo() {
        UserDao userDao = new UserDaoImpl();

        UserDao proxy= (UserDao) new MyJdkProxy(userDao).createProxy();
        proxy.save();
        proxy.delete();
        proxy.update();
        proxy.find();
    }
}
