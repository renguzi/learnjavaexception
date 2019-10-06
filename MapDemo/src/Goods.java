/**
 * @Author: Asher Huang
 * @Date: 2019-10-06
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class Goods {
    private String id;//商品id
    private String name;//商品名称
    private double price;//商品价格

    public Goods(String id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
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

    public String toString(){
        return "商品名称："+name+" 商品编号："+id+" 商品价格："+price;
    }
}
