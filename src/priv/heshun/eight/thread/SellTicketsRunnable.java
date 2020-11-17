package priv.heshun.eight.thread;

/**
 * @author heshun
 * @create 2020-11-16 23:52
 */
public class SellTicketsRunnable implements Runnable {

    /**
     * ticket为线程共享的数据
     */
    private static int railway_ticket = 100;

    /**
     * 任何一个类的对象，都可以充当锁；但要求多个线程必须要共用同一把锁
     * ** 此处object无需定义为static **
     *
     * 原因：Thread方式是多个线程new多个，而Runnable方式是多个线程只new一个
     * 因此，实现的方式更适合来处理多个线程有共享数据的情况
     *
     */
    private Object object = new Object();

    @Override
    public void run() {
        while(true) {
            // 线程同步，同步代码块
            synchronized (object) {
                // 在同步代码块中操作共享数据
                if(railway_ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + "售出第" + railway_ticket + "张火车票");
                    railway_ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
