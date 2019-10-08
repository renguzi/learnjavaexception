package cn.oracleonlinx.file.FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-08
 * @Description: cn.oracleonlinx.file.FileOutputStream
 * @Version:1.0
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/asher/testdir/a",true);
            FileInputStream fileInputStream = new FileInputStream("/Users/asher/testdir/a");
            fileOutputStream.write(100);
            fileOutputStream.write('h');
            System.out.println(fileInputStream.read());
            System.out.println((char) fileInputStream.read());
            fileOutputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
