package com.imooc.aop.cglib;

import org.junit.Test;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-21
 * @Description: com.imooc.aop.demo1.cglib
 * @Version:1.0
 */
public class ProductDaoTest {
    @Test
    public void demo() {
        ProductDao productDao = new ProductDao();

        ProductDao proxy= (ProductDao) new MyCglibProxy(productDao).createProxy();

        proxy.delete();
        proxy.find();
        proxy.save();
        proxy.update();

    }
}
