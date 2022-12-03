package javase_chapter8;

/***
 * 练习：使用Thread类继承或者是Runnable接口继承
 * 的方法实现多线程
 */
class MyThread1 extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=100;i=i+2)
        {
            System.out.println("thread1 = "+String.valueOf(i));
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i=2;i<=100;i=i+2)
        {
            System.out.println("thread2 = "+String.valueOf(i));
        }
    }
}

class Thread1 implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=100;i=i+2)
        {
            System.out.println("newthread1 = "+String.valueOf(i));
        }
    }
}

class Thread2 implements Runnable{
    @Override
    public void run() {
        for(int i=2;i<=100;i=i+2)
        {
            System.out.println("newthread2 = "+String.valueOf(i));
        }
    }
}

public class practice1 {
    public static void main(String[] args){
        //new MyThread1().start();
        //new MyThread2().start();
        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();
    }
}
