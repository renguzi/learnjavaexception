import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-05
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class ListDemo {
    public static void main(String[] args) {
//      父类(List)的引用，指向子类(ArrayList)的对象
        List list=new ArrayList();
        list.add("Java编程语言");
        list.add("C++");
        list.add("Go");
        list.add("SWIFT");
        list.add("Python");
//       输出列表中元素的个数
        System.out.println("list中一共有"+list.size()+"个元素");
//        遍历输出所有元素
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+", ");
        }
//        移除列表中的C++
//        list.remove("C++");
        list.remove(1);
//        移除C++之后遍历
        System.out.println("移除C++之后遍历");
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+", ");
        }
    }
}
