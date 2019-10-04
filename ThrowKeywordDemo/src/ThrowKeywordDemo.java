import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-04
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class ThrowKeywordDemo {
    public static void main(String[] args) {
        try {
            testAge();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    描述酒店入住，年龄<18或者>80的时候，需要有亲友陪伴才能入住
    public static void testAge() throws Exception {
        System.out.println("请输入年龄");
        Scanner scanner = new Scanner(System.in);
        int age=scanner.nextInt();
        if (age<18 || age>80){

                /**
                 * 1 throw抛出一个new的Exception对象实例，new Exception()构造方法，带一个字符串的构造方法；
                 * 2 抛出一个异常的对象实例之后，有两种处理方法：
                 * 要么是谁抛出异常谁处理，就是在当前位置处，添加try catch来处理这个异常；
                 * 要么是谁调用这个方法谁处理，就是在当前方法签名处，添加throws Exception,
                 * 将来谁调用这个方法，谁就需要处理这个异常。或者，谁调用该方法，谁也可以继续在
                 * 方法签名处，继续跑车这个异常。
                 * 3 通常情况下，throw关键字抛出异常的时候，不建议抛出unchecked Exception，因为
                 * 这种类型的异常，编译器不会要求我们强制去处理该类型异常。
                 */

                throw new  Exception("年龄<18或者>80的时候，需要有亲友陪伴才能入住");

        }else {
            System.out.println("欢迎光临");
        }
    }
}
