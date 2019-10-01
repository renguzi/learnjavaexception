import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-01
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */

/* 1 try抛出异常，catch用于捕获异常；
   2 try不能单独出现，要么跟catch、要么跟finally；
   3 或者，try、catch、finally同时出现；
*  4 catch、finally子句不可以配对出现，必须要有try子句；
   5 try后面，可以跟多个catch子句，通常把捕获异常的父类放到最后，
   用于守住最后一道捕获异常的门槛儿，防止有捕获不到错误的漏网之鱼出现。

* */
public class TestException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int x= 0;
        int y= 0;
        try {
            System.out.println("请输入第一个数：");
            x = scanner.nextInt();
            System.out.println("请输入第二个数：");
            y = scanner.nextInt();
            System.out.println("它们的商是：" + x / y);
        }catch(ArithmeticException e) {
            System.out.println("除数不能为0");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("请输入整数");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("程序出错了");
            e.printStackTrace();
        }
        finally {
            System.out.println("程序结束了");
        }
    }
}
