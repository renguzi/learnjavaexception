package cn.oracleonlinux.queue;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-07
 * @Description: cn.oracleonlinux.queue
 * @Version:1.0
 */
public class Consumer implements Runnable {
    Queue queue;

    Consumer(Queue queue) {
        this.queue=queue;
    }

    @Override
    public  void run() {
        while (true) {
            queue.get();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
