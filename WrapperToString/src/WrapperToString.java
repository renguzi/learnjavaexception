/**
 * @Author: Asher Huang
 * @Date: 2019-10-04
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class WrapperToString {
    public static void main(String[] args) {
//      基本类型转换为字符串
        int t1=2;
        String t2=Integer.toString(t1);
        System.out.println("基本数据类型int t1="+t1);
        System.out.println("字符串类型String t2="+t2);
//字符串类型转换为基本类型int
//        方法1，通过包装类的parseInt()方法
        int t3= Integer.parseInt(t2);
        System.out.println("字符串转换为int类型t3="+t3);
//        方法2，通过包装类的ValueOf()方法，先将字符串转换为包装类，然后包装类自动拆箱为int类型
        int t4= Integer.valueOf(t2);
        System.out.println("字符串转换为int类型t4="+t4);
    }
}
