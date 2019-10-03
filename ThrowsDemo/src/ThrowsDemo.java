import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-03
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            int result=test();
            System.out.println("x/y的商是：" + result);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("请输入整数");
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 1 throws关键字写在方法声明处，只是用于声明可能抛出的异常，
     * 如果有多个异常可能抛出，则用逗号分隔开；在当前方法里并不处理可能出现的异常；
     * 2 在调用该方法的位置处去处理可能抛出的异常，并且每个异常都要处理；
     * 3 如果throws后面写成checked exception和unchecked exception的父类，Exception的话，
     * 则在其它调用该方法的位置处，必须要捕获并处理异常。为什么呢？因为Exception涵盖检查异常，
     * 那么在程序编译阶段就要处理checked exception。所以，在其它直接调用该方法位置处，如果不处理异常的
     * 话，会报错。
     * @return
     * @throws ArithmeticException
     * @throws InputMismatchException
     */

    public static int test() throws ArithmeticException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第1个数：");
        int x=scanner.nextInt();
        System.out.println("请输入第2个数：");
        int y=scanner.nextInt();
//        System.out.println("x/y的商是：" + x / y);
        return x/y;
    }
}
