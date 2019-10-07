package cn.oracleonlinux.queue;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-07
 * @Description: cn.oracleonlinux.queue
 * @Version:1.0
 */
public class Producer implements Runnable{

    Queue queue;

    Producer(Queue queue) {
        this.queue=queue;
    }

    @Override
    public  void  run() {
        int i=0;
        while (true) {
            queue.set(i++);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
