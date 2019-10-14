package com.imooc.ioc.demo1;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-12
 * @Description: com.imooc.ioc.demo1
 * @Version:1.0
 */
public class SpringDemo1 {

    @Test
    /**
     * 传统方式开发
     */
    public void demo1(){
//        下面2行代码是传统方式实现
        UserService userService=new UserServiceImpl();
        userService.sayHello();
//        下面的代码是针对UserServiceImpl实现类里有新增属性时的：
//        也就是说spring的依赖注入dependency injection，对于传统方式，需要更改代码，而对于spring来讲，只需要更改配置文件
        UserServiceImpl userService1 = new UserServiceImpl();
        userService1.setName("李四");
        userService1.sayHello();
    }

    @Test
    /**
     * 使用spring方式
     */
    public void demo2() {
//        创建spring的工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        通过工厂获得类
        UserService userService = (UserService) applicationContext.getBean("UserService");
        userService.sayHello();
    }

    @Test
    /**
     * 使用spring方式来读取文件系统的配置文件
     */
    public void demo3() {
//        创建spring的工厂。这里的路径，默认会读取项目路径下的名称为我们指定的applicationContext.xml文件。即：
//        /Users/asher/IdeaProjects/learnjavaexception/spring_ioc/applicationContext.xml
//        如果想写成，/Users/asher/IdeaProjects/applicationContext.xml会报错，暂时还不知道怎么解决？
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("applicationContext.xml");
//        获得工厂类对象
        UserService userService= (UserService) applicationContext.getBean("UserService");
        userService.sayHello();
    }

    @Test
    /**
     * 通过原始的BeanFactory方式读取配置文件
     */

    public void demo4() {
//       通过旧方式的BeanFactory来创建工厂类
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        获得工厂类对象
        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.sayHello();
    }

    @Test
    /**
     * 通过原始的BeanFactory方式读取文件系统上的配置文件
     */
    public void demo5() {
//        通过BeanFactory来创建工厂类
        BeanFactory beanFactory=new FileSystemXmlApplicationContext("applicationContext.xml");
//        实例化工厂类对象
        UserService userService= (UserService) beanFactory.getBean("UserService");
        userService.sayHello();

    }



}
