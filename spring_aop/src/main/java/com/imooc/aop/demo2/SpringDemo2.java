package com.imooc.aop.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-21
 * @Description: com.imooc.aop.demo2
 * @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class SpringDemo2 {

//    @Resource(name = "studentDao")
    @Resource(name = "studentDaoProxy")
    private StudentDao studentDao;

    @Test
    public void demo1() {
        studentDao.find();
        studentDao.delete();
        studentDao.save();
        studentDao.update();
    }


}
