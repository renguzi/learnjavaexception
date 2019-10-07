package cn.oracleonlinux.queue;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-07
 * @Description: cn.oracleonlinux.queue
 * @Version:1.0
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
//        这里用了3个步骤写在一起的方式来启动线程
//        如果是通过实现了Runnable接口的方式来创建的线程，启动它，需要：
//        1 创建一个实现了Runnable接口类的对象；
//        2 然后把这个对象当作Thread构造方法的参数去创建一个线程对象；
//        3 最后，通过这个线程对象.start()来启动线程。
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}
