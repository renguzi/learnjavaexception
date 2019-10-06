/**
 * @Author: Asher Huang
 * @Date: 2019-10-06
 * @Description: PACKAGE_NAME
 * @Version:1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("main线程1在运行");
        MyThread myThread = new MyThread();
        //启动线程，启动的方法是调用start()方法,而不是去调用run()方法
//        线程只能启动1次，如果再次执行myThread.start()将会抛出运行时异常
        myThread.start();
//        myThread.start();
        System.out.println("main线程2在运行");

    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println(getId()+" "+ getName()+"当前线程正在运行");
    }
}