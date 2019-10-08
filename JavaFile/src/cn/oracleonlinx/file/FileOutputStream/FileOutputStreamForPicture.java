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
public class FileOutputStreamForPicture {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/asher/Downloads/袁大头.jpg");
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/asher/Downloads/袁大头-cp.jpg");
            int n=0;
            byte[] byteArray=new byte[1024];
            while ((n=fileInputStream.read(byteArray))!=-1){
                    fileOutputStream.write(byteArray,0,n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
