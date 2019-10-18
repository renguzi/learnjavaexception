package com.imooc.demo1;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-18
 * @Description: com.imooc.demo1
 * @Version:1.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 通过注解方式来使用bean
 * 传统方式，是需要在applicationContext.xml文件中配置<bean id="" class=""></bean>
 * 注解方式，只需要在Bean前面加个@
 *
 */

@Component("userservice")
public class UserService {

    @Value("面条")
    private String sth;

//  1  @Autowired默认按照类类型来注入，表示的要把private UserDao userDao；定义的UserDao这个类给注入进来
//    此时，在UserDao这个bean里定义的@Repository里定义的名字和这里没有任何关联
//  2 @Autowired和@Qualifier这2个注解放在一起使用，表示的是要通过Qualifier后面指定的名字和UserDao类里的@Repository里定义的名字，必须匹配

//  3 @Resource这1个注解，等价于@Autowired和@Qualifier这2个注解

//    @Autowired
//    @Qualifier("userdao")
    @Resource(name = "userdao")
    private UserDao userDao;

    public String sayHello(String s) {
        return "Hello"+s;
    }

    public void eat() {
        System.out.println("eat:" + sth);
    }

    public void save() {
        System.out.println("UserService中的save()方法...");
        userDao.save();
    }
}
