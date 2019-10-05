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

//        添加重复数据，进行测试，创建一支相同的猫
//        如果不在Cat类中，override equals和hashCode方法的话，则无法保证不能添加重复猫对象
        Cat huahua01 = new Cat("花花", 12, "英国短毛猫");
        set.add(huahua01);
        System.out.println("重复添加猫对象之后：");
        iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        从Set中查找
//        利用对象名称huahua来查找，比较简单
        if(set.contains(huahua)){
            System.out.println("huahua找到了");
            System.out.println(huahua);
        }else {
            System.out.println("huahua没找到");
        }

//        在集合中，使用猫的名称来查找
        System.out.println("在集合中，使用猫的名称来查找");
        iterator=set.iterator();
        Cat cat=null;
        while (iterator.hasNext()){
             cat=(Cat)(iterator.next());
            if (cat.getName()=="花花"){
                System.out.println("花花找到了");
                System.out.println(cat);
                break;
            }
            else {
                System.out.println("花花没找到");
            }
        }
    }
}
