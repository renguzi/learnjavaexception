package com.imooc.aop.demo5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-22
 * @Description: com.imooc.aop.demo5
 * @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringDemo5Test {
    @Resource(name = "studentDao")
    private StudentDao studentDao;
    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Test
    public void demo() {
        studentDao.find();
        studentDao.save();
        studentDao.delete();
        studentDao.update();

        customerDao.delete();
        customerDao.find();
        customerDao.insert();
        customerDao.save();
    }

}
