package com.imooc.ioc.beanshuxingzhurufangshi;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-16
 * @Description: com.imooc.ioc.beanshuxingzhurufangshi
 * @Version:1.0
 */
public class UserTest {

    @Test
    public void constructorDI() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }

}
