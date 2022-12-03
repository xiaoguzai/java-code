package javase_chapter8;

import java.util.concurrent.locks.ReentrantLock;

/***
 * 两客户买票，使用ReentrantLock()类实现
 */
class Window implements Runnable{
    int ticket = 100;
    private final ReentrantLock lock = new ReentrantLock();
    public void run(){

        while(true){
            try{
                lock.lock();
                if(ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ticket--);
                }else{
                    break;
                }
            }finally{
                lock.unlock();
            }
        }
    }

}

public class threadlock {
    public static void main(String[] args) {
        Window t = new Window();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.start();
        t2.start();
    }
}
