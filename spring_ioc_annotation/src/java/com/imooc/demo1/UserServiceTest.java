package com.imooc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-18
 * @Description: com.imooc.demo1
 * @Version:1.0
 */
public class UserServiceTest {

    @Test
    public void demo() {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userservice = (UserService) applicationContext.getBean("userservice");
        System.out.println(userservice.sayHello("使用注解方式来使用bean！"));
    }

    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userservice = (UserService) applicationContext.getBean("userservice");
        userservice.eat();
    }

    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userservice = (UserService) applicationContext.getBean("userservice");
        userservice.save();
    }
}
