package javase_chapter8;

import java.util.concurrent.locks.ReentrantLock;

class Window2 implements Runnable{
    private int ticket = 100;
    Object obj = new Object();
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true)
        {

            try {
                Thread.sleep((long) (Math.random()*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(ticket > 0)
            {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + ":卖票，票号为" + String.valueOf(ticket));
                ticket--;
                //注意synchronized位置，保证睡眠之后再进行抢票
                lock.unlock();
            }
            else
            {
                break;
            }

        }
    }
}

public class getticket_lock {
    public static void main(String[] args) {
        Window2 w = new Window2();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
