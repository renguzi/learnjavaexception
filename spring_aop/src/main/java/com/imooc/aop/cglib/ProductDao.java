package com.imooc.aop.cglib;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-21
 * @Description: com.imooc.aop.demo1.cglib
 * @Version:1.0
 */
public class ProductDao {

    public void save() {
        System.out.println("保存方法执行了...");
    }

    public void update() {
        System.out.println("update");
    }

    public void delete() {
        System.out.println("delete");
    }

    public void find() {
        System.out.println("find....");
    }
}
