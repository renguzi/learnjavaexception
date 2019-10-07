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
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}
