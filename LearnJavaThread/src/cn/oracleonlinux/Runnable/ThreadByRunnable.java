package cn.oracleonlinux.Runnable;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-06
 * @Description: cn.oracleonlinux.Runnable
 * @Version:1.0
 */
public class ThreadByRunnable {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
//      通过实现Runnable接口创建的线程，其启动方式，必须通过Thread的构造方法，创建1个线程对象
//        然后，再通过该对象来启动线程
        Thread thread1 = new Thread(myThread1);
        thread1.start();
//        下面的这种方式，是一步到位，new Thread()把实现了Runnable接口的对象引用传递进去，
//        然后，直接调用start()方法来启动线程。Oracle的Thread官方文档就是这种示例。
        new Thread(myThread1).start();
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
//            通过继承Thread类的线程，直接调用getName()方法来获取线程名
//            通过实现Runnable()接口的线程，需要通过调用Thread.currentThread().getName()来获取线程名
            System.out.println(Thread.currentThread().getName() + "正在运行"+(i+1));
        }
    }
}