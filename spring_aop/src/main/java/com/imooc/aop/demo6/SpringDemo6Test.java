package com.imooc.aop.demo6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-22
 * @Description: com.imooc.aop.demo6
 * @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo6Test {
    @Resource(name = "customerDao")
    private CustomerDao customerDao;
    @Resource(name = "studentDao")
    private StudentDao studentDao;

    @Test
    public void demo() {
        customerDao.delete();
        customerDao.find();
        customerDao.insert();
        customerDao.save();

        studentDao.delete();
        studentDao.find();
        studentDao.save();
        studentDao.update();
    }
}
