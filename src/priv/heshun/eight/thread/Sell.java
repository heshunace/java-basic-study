package priv.heshun.eight.thread;

/**
 *
 * @author heshun
 * @create 2020-11-16 23:23
 */
public class Sell {

    public static void main(String[] args) {

        SellTicketsThread ticketsThread1 = new SellTicketsThread();
        ticketsThread1.setName("售票员1号");
        SellTicketsThread ticketsThread2 = new SellTicketsThread();
        ticketsThread2.setName("售票员2号");
        SellTicketsThread ticketsThread3 = new SellTicketsThread();
        ticketsThread3.setName("售票员3号");

        SellTicketsRunnable ticketsRunnable = new SellTicketsRunnable();
        Thread ticketsThread4 = new Thread(ticketsRunnable);
        ticketsThread4.setName("售票员4号");
        Thread ticketsThread5 = new Thread(ticketsRunnable);
        ticketsThread5.setName("售票员5号");

//        ticketsThread1.start();
//        ticketsThread2.start();
//        ticketsThread3.start();
        ticketsThread4.start();
        ticketsThread5.start();
    }

}
