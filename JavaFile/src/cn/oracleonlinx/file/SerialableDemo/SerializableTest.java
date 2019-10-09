package cn.oracleonlinx.file.SerialableDemo;

import java.io.*;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-09
 * @Description: cn.oracleonlinx.file.SerialableDemo
 * @Version:1.0
 */
public class SerializableTest {
    public static void main(String[] args) {
        Goods goods = new Goods("1001", "Mac", 9099);
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("/Users/asher/testdir/mac.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            FileInputStream fileInputStream=new FileInputStream("/Users/asher/testdir/mac.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
//            将对象信息写入文件
            objectOutputStream.writeObject(goods);
            objectOutputStream.flush();
//          从文件中读取对象信息
            Goods mac = (Goods) objectInputStream.readObject();
            System.out.println(mac);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
