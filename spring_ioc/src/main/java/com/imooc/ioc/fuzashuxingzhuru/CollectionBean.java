package com.imooc.ioc.fuzashuxingzhuru;

import java.util.*;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-17
 * @Description: com.imooc.ioc.fuzashuxingzhuru
 * @Version:1.0
 */
public class CollectionBean {
    private String[] arr;
    private List<String> list;
    private Set<String> set;
    private Map<String,Integer> map;
    private Properties properties;

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "CollectionBean{" +
                "arr=" + Arrays.toString(arr) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
