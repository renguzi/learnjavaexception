package cn.oracleonlinx.file.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-08
 * @Description: cn.oracleonlinx.file.FileInputStream
 * @Version:1.0
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {

        byte[] b1=new byte[10];
        for (int i = 0; i <b1.length ; i++) {
            System.out.println(String.valueOf(b1[i]));

        }

        File file = new File("/Users/asher/testdir/a");
        byte[] b=new byte[20];
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/asher/testdir/a");
//            1 读取出来的数据是以byte为单位的，这里把它转换为char然后输出
//            int i=0;
//            while ((i=fileInputStream.read()) != -1){
//                System.out.print((char)i);
//            }

//            下面是通过另外一个方法read()来读取文件内容，存放到byte[],字节数组中
//            fileInputStream.read(b,0,5);
            fileInputStream.read(b);
            System.out.println("读出放到byte[b]的结果："+new String(b));
            fileInputStream.close();
//            System.out.println(fileInputStream.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
