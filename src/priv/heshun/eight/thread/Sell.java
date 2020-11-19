package priv.heshun.eight.thread;

/**
 *
 * @author heshun
 * @create 2020-11-16 23:23
 */
public class Sell {

    public static void main(String[] args) {

        // 同步代码块处理继承Thread类的线程安全问题
        SyncBlockThread ticketsThread1 = new SyncBlockThread();
        ticketsThread1.setName("售票员1号");
        SyncBlockThread ticketsThread2 = new SyncBlockThread();
        ticketsThread2.setName("售票员2号");
        SyncBlockThread ticketsThread3 = new SyncBlockThread();
        ticketsThread3.setName("售票员3号");

        // 同步代码块处理实现Runnable接口的线程安全问题
        SyncBlockRunnable ticketsRunnable = new SyncBlockRunnable();
        Thread ticketsThread4 = new Thread(ticketsRunnable);
        ticketsThread4.setName("售票员4号");
        Thread ticketsThread5 = new Thread(ticketsRunnable);
        ticketsThread5.setName("售票员5号");

        // 同步方法处理继承Thread类的线程安全问题
        SyncMethodThread ticketsThread6 = new SyncMethodThread();
        ticketsThread6.setName("售票员6号");
        SyncMethodThread ticketsThread7 = new SyncMethodThread();
        ticketsThread7.setName("售票员7号");

        // 同步方法处理实现Runnable接口的线程安全问题
        SyncMethodRunnable ticketsRunnable2 = new SyncMethodRunnable();
        Thread ticketsThread8 = new Thread(ticketsRunnable2);
        ticketsThread8.setName("售票员8号");
        Thread ticketsThread9 = new Thread(ticketsRunnable2);
        ticketsThread9.setName("售票员9号");

//        ticketsThread1.start();
//        ticketsThread2.start();
//        ticketsThread3.start();
//        ticketsThread4.start();
//        ticketsThread5.start();
//        ticketsThread6.start();
//        ticketsThread7.start();
//        ticketsThread8.start();
//        ticketsThread9.start();
    }

}
