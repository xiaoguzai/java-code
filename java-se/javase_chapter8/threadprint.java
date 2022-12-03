package javase_chapter8;

import java.util.Random;

/***
 *
 */
class Communication implements Runnable{
    private int number = 0;


    @Override
    public void run() {
        while (true){
            synchronized (this){
                try {
                    Thread.sleep((long) (Math.random()*100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                notify();
                if(number <= 100)
                {
                    System.out.println(Thread.currentThread().getName()+":"+(number));
                    number++;
                }
                else
                {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

     /***
    @Override
    public void run() {
        while(true)
        {
            synchronized (this)
            {
                notify();
                if(number <= 100)
                {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                else
                {
                    break;
                }
            }
        }
    }
    ***/
}

public class threadprint {
    public static void main(String[] args) {
        Communication c = new Communication();
        new Thread(c).start();
        new Thread(c).start();
    }
}
