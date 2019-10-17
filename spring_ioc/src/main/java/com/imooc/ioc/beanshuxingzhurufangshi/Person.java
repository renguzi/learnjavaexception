package com.imooc.ioc.beanshuxingzhurufangshi;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-17
 * @Description: com.imooc.ioc.beanshuxingzhurufangshi
 * @Version:1.0
 */
public class Person {
    private String name;
    private Integer age;
    private Cat cat;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                '}';
    }
}
