package com.imooc.aop.demo1;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-21
 * @Description: com.imooc.aop.demo1
 * @Version:1.0
 */
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("保存方法执行了...");
    }

    public void delete() {
        System.out.println("删除方法执行了....");
    }

    public void update() {
        System.out.println("更新方法执行了....");
    }

    public void find() {
        System.out.println("查找方法执行了...");
    }
}
