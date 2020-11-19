package priv.heshun.eight.thread;

/**
 * 同步方法处理继承Thread类的线程安全问题
 * @author heshun
 * @create 2020-11-18 08:10
 */
public class SyncMethodThread extends Thread {

    /**
     * busTicket为线程共享的数据
     */
    private static int busTicket = 100;

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
     * 此处为继承Thread类的方式
     * 则同步方法必须声明为静态的
     * 同步监视器是当前类本身
     * ******************************
     *
     * @return busTicket
     */
    private static synchronized int sell() {
        if(busTicket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    + "售出第" + busTicket + "张汽车票");
            busTicket--;
        }
        return busTicket;
    }
}
