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
        int i=0;
        while (i <3 ) {
            System.out.println("请输入第" + (i+1) + "条商品信息：");
            System.out.println("请输入商品编号：");
            String goodsId=scanner.next();
            if(stringGoodsHashMap.containsKey(goodsId)){
                System.out.println("输入的商品编号重复了，请重新输入：");
                continue;
            }
            System.out.println("请输入商品名称：");
            String goodsName=scanner.next();
            System.out.println("请输入商品价格：");

            double goodsPrice= 0;
            try {
                goodsPrice = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("输入的商品价格格式不对，请输入数字");
                scanner.next();
                continue;
            }
            Goods goods = new Goods(goodsId, goodsName, goodsPrice);
            stringGoodsHashMap.put(goodsId,goods);
            i++;
        }

//        遍历输出商品信息
        Iterator<String> iterator = stringGoodsHashMap.keySet().iterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            System.out.println(stringGoodsHashMap.get(iterator.next()));
        }
    }
}
