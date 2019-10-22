package com.imooc.aop.demo4;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-21
 * @Description: com.imooc.aop.demo4
 * @Version:1.0
 */
public class CustomerDao {
    public void save(){
        System.out.println("保存");
    }

    public void find() {
        System.out.println("查找");
    }

    public void delete() {
        System.out.println("删除");
    }

    public void insert(){
        System.out.println("插入");
    }
}
