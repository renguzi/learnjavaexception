import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-04
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class TestCustomerException {
    public static void main(String[] args) {

            testAge();
//        } catch (CustomerException e) {
//
////            e.printStackTrace();
//        } catch (InputMismatchException e){
//            System.out.println("年龄输入错误，请输入整数");
////            e.printStackTrace();
//        }
    }

    public static void testAge() {
        System.out.println("请输入年龄");
        Scanner scanner = new Scanner(System.in);
        int age=scanner.nextInt();
        if (age<18 || age >80){
            try {
                throw new CustomerException();
            } catch (CustomerException e) {
                System.out.println("酒店前台不允许办理入住");
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("欢迎入住");
        }

    }
}
