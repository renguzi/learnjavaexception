package com.imooc.ioc.com.imooc.ioc.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-16
 * @Description: com.imooc.ioc.com.imooc.ioc.beanlifecycle
 * @Version:1.0
 */
public class BeanLifecylce implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String name;
    public BeanLifecylce() {
        System.out.println("第一步：BeanLifecylce被构造方法执行了");
    }

    public void setName(String name) {
        System.out.println("第二步：设置bean属性");
        this.name = name;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("第三步：设置beanname"+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步：了解工厂信息");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步：属性设置后");
    }

    public void init() {
        System.out.println("第七步：BeanLifecycle被初始化了");
    }

    public void run() {
        System.out.println("第九步：执行bean自身的方法，即：处理业务逻辑方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十步：因为实现了DisposableBean，所以要执行destory()方法");
    }

    public void teardown() {
        System.out.println("第十一步：执行用户自定义的销毁方法。BeanLifecycle被销毁了");
    }
}
