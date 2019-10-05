import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-05
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class HashSetDemo {
    public static void main(String[] args) {
//       向HashSet中添加元素:Red,Blue,Yellow,Pink,White,并遍历打印输出
        Set set = new HashSet();
        set.add("Red");
        set.add("Blue");
        set.add("Yellow");
        set.add("Pink");
        set.add("While");


        System.out.println("set中的元素有：");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Iterator iter = set.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());

        }

        Object[] strings= set.toArray();
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);

        }
    }
}
