package com.imooc.aop.demo6;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-21
 * @Description: com.imooc.aop.demo2
 * @Version:1.0
 */
public class StudentDaoImpl implements StudentDao {
    public void save() {
        System.out.println("保存学生");
    }

    public void find() {
        System.out.println("查找学生");
    }

    public void update() {
        System.out.println("更新学生");
    }

    public void delete() {
        System.out.println("删除学生");
    }
}
