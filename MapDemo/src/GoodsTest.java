import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-06
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class GoodsTest {
    public static void main(String[] args) {
//        添加3条商品信息，存入HashMap中，商品ID作为key,商品信息作为value
        System.out.println("请输入3条商品信息");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Goods> stringGoodsHashMap = new HashMap<>();
        for (int i = 0; i <3 ; i++) {
            System.out.println("请输入第" + i + "条商品信息：");
            System.out.println("请输入商品编号：");
            String goodsId=scanner.next();
            System.out.println("请输入商品名称：");
            String goodsName=scanner.next();
            System.out.println("请输入商品价格：");
            double goodsPrice=scanner.nextDouble();
            Goods goods = new Goods(goodsId, goodsName, goodsPrice);
            stringGoodsHashMap.put(goodsId,goods);
        }

//        遍历输出商品信息
        Iterator<String> iterator = stringGoodsHashMap.keySet().iterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            System.out.println(stringGoodsHashMap.get(iterator.next()));
        }
    }
}
