package com.imooc.demo1;

import org.springframework.stereotype.Repository;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-18
 * @Description: com.imooc.demo1
 * @Version:1.0
 */
@Repository("userdao")
public class UserDao {

    public void save() {
        System.out.println("UserDao中的save方法...");
    }
}
