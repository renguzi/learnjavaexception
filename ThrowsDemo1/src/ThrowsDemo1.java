import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-03
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class ThrowsDemo1 {
    public static void main(String[] args) {
        try {
            int result=test();
            System.out.println("x/y"+result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int test() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第1个数");
        int x=scanner.nextInt();
        System.out.println("输入第2个数");
        int y=scanner.nextInt();
        return x/y;
    }
}
