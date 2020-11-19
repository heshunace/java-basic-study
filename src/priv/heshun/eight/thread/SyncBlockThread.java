package priv.heshun.eight.thread;

/**
 * 同步代码块处理继承Thread类的线程安全问题
 * @author heshun
 * @create 2020-11-16 23:22
 */
public class SyncBlockThread extends Thread {

    /**
     * air_ticket为线程共享的数据
     * 此处同样必须为static
     */
    private static int air_ticket  = 100;

    /**
     * 任何一个类的对象，都可以充当锁；但要求多个线程必须要共用同一把锁
     * ** 所以此处object必须为static **
     */
    private static Object object = new Object();

    @Override
    public void run() {
        while(true) {
            // 线程同步，同步代码块
            synchronized (object) {
                // 在同步代码块中操作共享数据
                if(air_ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + "售出第" + air_ticket + "张飞机票");
                    air_ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
