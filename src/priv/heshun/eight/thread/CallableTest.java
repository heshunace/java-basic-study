package priv.heshun.eight.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 采用实现Callable接口的方式创建多线程
 * @author heshun
 * @create 2020-11-24-10:52
 **/
public class CallableTest implements Callable {

    /**
     * 100以内(包含100)的偶数和
     */
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        CallableTest test = new CallableTest();
        FutureTask<Integer> futureTask = new FutureTask<>(test);
        Thread thread1 = new Thread(futureTask);
        thread1.start();
        Thread thread2 = new Thread(futureTask);
        thread2.start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
