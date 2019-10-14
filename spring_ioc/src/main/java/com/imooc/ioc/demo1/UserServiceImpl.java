package com.imooc.ioc.demo1;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-12
 * @Description: com.imooc.ioc.demo1
 * @Version:1.0
 */
public class UserServiceImpl implements UserService {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello Spring"+name);
    }
}
