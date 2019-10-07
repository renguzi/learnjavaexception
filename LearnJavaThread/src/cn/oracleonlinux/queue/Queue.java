package cn.oracleonlinux.queue;

/**
 * @Author: Asher Huang
 * @Date: 2019-10-07
 * @Description: cn.oracleonlinux.queue
 * @Version:1.0
 */
public class Queue {
    private int n;
//    添加flag字段，用于控制生产和消费必须是一个一个的轮流进行，
//    否则的话，在执行的过程中，有可能出现生产一个n,连续消费n两次，或者连续生产2个n，只消费1个n
    private boolean flag=false;

    public synchronized int get() {
//       当flag=false的时候，表示还没有生产出来，就不能消费，就执行等待wait();
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费n:" + n);
//        消费完毕，把flag置为false
        flag=false;
 //      如果不唤醒线程的话，会出现消费完毕之后，没有生产线程来生产
        notifyAll();
        return n;
        // 没有过编程经验，把这一行写在return之后，会提示错误：
//       Unreachable statement!!!!
//        flag=false;
    }

    public synchronized void set(int n) {
//        当flag=true时，开始执行生产
       if (flag){
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
        System.out.println("生产n:" + n);
        this.n = n;
//        生产完毕，容器中已经有数据，把flag职位false，表示不再生产，等待被消费
        flag=true;
//      如果不唤醒线程的话，会出现生产完毕之后，没有消费线程来消费
        notifyAll();
    }
}
