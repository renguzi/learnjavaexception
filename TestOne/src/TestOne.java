/**
 * @Author: Asher Huang
 * @Date: 2019-10-01
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class TestOne {
    public static void main(String[] args) {
        try {
            int a=1-1;
            System.out.println("a= " + a);
            int c[]={1};
            c[10]=99;            int b=4/a;

        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }

    }
}
