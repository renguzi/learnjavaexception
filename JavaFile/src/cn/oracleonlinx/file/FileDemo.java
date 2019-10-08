package cn.oracleonlinx.file;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-08
 * @Description: cn.oracleonlinx.file
 * @Version:1.0
 */
public class FileDemo {
    public static void main(String[] args) {
//        File file = new File("/Users/asher/learngit");
        File file=new File("/Users/asher/");
        File file1 = new File(file, "learngit/readme.txt");

        System.out.println("文件是否是路径：？"+file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getName());
        System.out.println(file1.getTotalSpace());
        System.out.println("文件是否是文件：？"+file.isFile());

        File file2=new File("/Users/asher", "/testdir/a");
        if (!file2.isDirectory()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(file2.exists());
        System.out.println(file2.getAbsolutePath());


    }
}
