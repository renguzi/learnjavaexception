import java.io.UnsupportedEncodingException;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-04
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class StringToByteArray {
    public static void main(String[] args) {
        String str=new String("我爱JAVA 编程");
        try {
            byte[] arr=str.getBytes("UTF-8");
            for (byte b: arr) {
                System.out.print(b+" ");
            }
//            把字符串数组再转换为字符串，并打印输出。通过含有字符数组作为参数的构造函数来创建
//            一个字符串
            String  bytearray=new String(arr);
            System.out.println(bytearray);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
