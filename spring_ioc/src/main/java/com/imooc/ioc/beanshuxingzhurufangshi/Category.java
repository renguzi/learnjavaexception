package com.imooc.ioc.beanshuxingzhurufangshi;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-17
 * @Description: com.imooc.ioc.beanshuxingzhurufangshi
 * @Version:1.0
 */
public class Category {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
