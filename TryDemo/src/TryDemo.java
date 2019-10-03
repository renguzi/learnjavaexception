import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-03
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class TryDemo {
    public static void main(String[] args) {
        int result=test();
        System.out.println("x/y的商是：" + result);
    }

    public static int test(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入第1个数：");
            int x=scanner.nextInt();
            System.out.println("请输入第2个数：");
            int y=scanner.nextInt();
            return x/y;
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            return 0;
        } finally {
            System.out.println("=========运算结束=========");
//            return -100;
        }

    }
}

