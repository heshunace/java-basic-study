package priv.heshun.eight.thread;

/**
 * 一个简单的公平锁(两个线程)
 * @author heshun
 * @create 2020-11-22 16:12
 *
 * wait():一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
 * notify():一旦执行此方法，就会唤醒被wait的一个线程；如果有多个线程被wait，就唤醒优先级高的那个
 * notifyAll():一旦执行此方法，就会唤醒所有被wait的线程
 */
public class SimpleFairLock implements Runnable {

    private int num = 0;

    private Object object = new Object();

    @Override
    public void run() {
        while(true) {
            synchronized (object) {
                object.notify();
                if (num <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() +
                            "打印了" + num);
                    num++;
                    try {
                        // 调用wait()方法的线程进入阻塞状态
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        SimpleFairLock simpleFairLock = new SimpleFairLock();
        Thread thread1 = new Thread(simpleFairLock);
        thread1.setName("线程1");
        Thread thread2 = new Thread(simpleFairLock);
        thread2.setName("线程2");
        thread1.start();
        thread2.start();
    }
}
