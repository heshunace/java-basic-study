package priv.heshun.eight.thread;

import java.util.concurrent.*;

/**
 * @author heshun
 * @create 2020-11-24-11:49
 **/
public class ThreadPoolTest implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "输出：" + i);
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor executor = (ThreadPoolExecutor) service;
        executor.setCorePoolSize(15);

        // 适用于Runnable
        service.execute(new ThreadPoolTest());
        // 适合于Callable
        Future<Integer> future = service.submit(new CallableTest());

        try {
            Integer sum = future.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        // 关闭线程池
        service.shutdown();
    }
}
