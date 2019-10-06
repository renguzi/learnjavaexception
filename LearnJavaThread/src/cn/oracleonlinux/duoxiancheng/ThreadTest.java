package cn.oracleonlinux.duoxiancheng;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-06
 * @Description: cn.oracleonlinux.duoxiancheng
 * @Version:1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("线程1");
        MyThread myThread2 = new MyThread("线程2");
        myThread1.start();
        myThread2.start();
    }
}

class MyThread extends Thread{
      public MyThread(String name){
          super(name);
      }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"运行第" + i+"次");
        }
    }
}
