package cn.oracleonlinx.file.SerialableDemo;

import java.io.Serializable;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-09
 * @Description: cn.oracleonlinx.file.SerialableDemo
 * @Version:1.0
 */
public class Goods implements Serializable {
    private String id;
    private String name;
    private double price;

    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
