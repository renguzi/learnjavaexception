package com.imooc.demo2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-18
 * @Description: com.imooc.demo2
 * @Version:1.0
 */
@Component("bean1")
public class Bean1 {

    @PostConstruct
    public void init() {
        System.out.println("initBean1");
    }

    public void say() {
        System.out.println("say方法");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("desroyBean1");
    }
}
