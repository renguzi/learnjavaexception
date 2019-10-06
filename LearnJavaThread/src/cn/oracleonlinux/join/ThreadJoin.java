package cn.oracleonlinux.join;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-06
 * @Description: cn.oracleonlinux.join
 * @Version:1.0
 */
public class ThreadJoin {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        try {
            thread.join(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <30 ; i++) {
            System.out.println("主线程开始运行" + (i + 1) + "次");
        }

        System.out.println("主线程运行结束");
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <300 ; i++) {
            System.out.println(Thread.currentThread().getName() + "运行"+(i+1)+"次");
        }
    }
}
