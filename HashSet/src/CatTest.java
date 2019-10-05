import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-05
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class CatTest {
    public static void main(String[] args) {
//        创建宠物猫对象
        Cat huahua = new Cat("花花", 12, "英国短毛猫");
        Cat fanfan = new Cat("凡凡", 5, "中华田园猫");

//        宠物猫对象添加到Set的HashSet中
        Set set = new HashSet();
        set.add(huahua);
        set.add(fanfan);
//        从HashSet中遍历宠物猫信息
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
//默认情况下，这里只会打印对象的内存地址，如果想打印毛的相关信息，有两种方法：
//            1 在Cat类中，override toString 方法，然后直接用iterator.next()迭代；
//            2 强制类型转换，然后用Cat的getter方法，拼接名称、年龄、品种等
//            System.out.println(((Cat) (iterator.next())).getName());
            System.out.println(iterator.next());
        }

    }
}
