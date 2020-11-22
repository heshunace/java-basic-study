package priv.heshun.eight.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author heshun
 * @create 2020-11-22 09:36
 */
class Account {

    private double balance;

    /**
     * 通过显式定义同步锁对象来实现同步
     * 显式锁需要手动开启和释放
     */
    private ReentrantLock lock = new ReentrantLock(true);

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt) {
        // 加锁
        lock.lock();
        if(amt > 0) {
            balance += amt;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +
                    "存钱成功，余额为：" + balance);
        }
        // 释放锁
        lock.unlock();
    }
}

public class DepositLock extends Thread {

    private Account account;

    public DepositLock(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }

    public static void main(String[] args) {
        Account account = new Account(0);
        DepositLock thread1 = new DepositLock(account);
        thread1.setName("储户1");
        DepositLock thread2 = new DepositLock(account);
        thread2.setName("储户2");
        thread1.start();
        thread2.start();
    }
}
