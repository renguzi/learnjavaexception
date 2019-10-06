import java.util.*;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-05
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class HashMapDemo {
    /**
     * 向map中，添加英文单词和其中文意义，使其成为Key-Value
     * 然后，从map中单独取出中文value；
     * 最后，在从map中，取出其Key-Value键值对
     */
    public static void main(String[] args) {
        Map<String,String> stringStringMap=new HashMap<String, String>();
//        接收从键盘输入的3组英文单词和其中文注释，并存入到map中
        Scanner scanner = new Scanner(System.in);
        System.out.println("请从键盘输入3组单词及其中文含义：");
        for (int i = 0; i <3 ; i++) {
            System.out.println("请输入英文单词:");
            String key=scanner.next();
            System.out.println("请输入中文注释:");
            String value=scanner.next();
            stringStringMap.put(key,value);
        }

//       输出存储在map中的3个中文释义
        System.out.println("输出存储在map中的3个中文释义");
        Iterator iterator=stringStringMap.values().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        输出存储在map中的3个键值对
        System.out.println("存储在map中的3个键值对：");
        Set<Map.Entry<String, String>> entrySet = stringStringMap.entrySet();
        for (Map.Entry<String,String> entryset:entrySet) {
            System.out.println(entryset.getKey() + " : " + entryset.getValue());
        }

//        通过单词找到注释输出
        System.out.println("输入要查找的单词：");
        String word=scanner.next();
        Iterator<String> iterator1 = stringStringMap.keySet().iterator();
        while (iterator1.hasNext()){
            String string=iterator1.next();
            if (string.equals(word)){
                System.out.println("找到了"+"key:"+string+" value:"+stringStringMap.get(string));
                break;
            }else {
                if(!(iterator1.hasNext())) {
                    System.out.println("没找到");
                }
                else continue;
            }
        }

    }
}
