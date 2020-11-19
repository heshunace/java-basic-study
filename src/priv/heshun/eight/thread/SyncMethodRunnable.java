package priv.heshun.eight.thread;

/**
 * 同步方法处理实现Runnable接口的线程安全问题
 * @author heshun
 * @create 2020-11-18 08:15
 */
public class SyncMethodRunnable implements Runnable {


    /**
     * shipTicket为线程共享的数据
     */
    private int shipTicket = 100;

    @Override
    public void run() {
        while(true) {
            int restTicket = sell();
            if(restTicket == 0) {
                break;
            }
        }
    }

    /**
     * 在同步方法中操作共享数据
     *
     * ******************************
     * 注意：同步方法仍然涉及到同步监视器，只是不需要显示的声明
     * 此处为实现Runnable接口的方式
     * 则同步方法可声明为非静态的
     * 同步监视器是this
     * ******************************
     *
     * @return shipTicket
     */
    private synchronized int sell() {
        if(shipTicket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    + "售出第" + shipTicket + "张船票");
            shipTicket--;
        }
        return shipTicket;
    }

}
