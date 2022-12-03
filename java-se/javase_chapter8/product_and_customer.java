package javase_chapter8;

import java.util.concurrent.locks.ReentrantLock;


class Clerk{
    private int product = 0;
    private Object object;
    public void addProduct(){
        while (true) {
            try {
                Thread.sleep((long) (Math.random()*100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (this)
            {
                notifyAll();
                /***
                 * 这里如果使用notify()会报错IllegalMonitorState
                 * 查看一下IllegalMonitorStateException之中
                 * Thrown to indicate that a thread has attempted to
                 * wait on an object's monitor or to notify other threads
                 * ...
                 * 总而言之就是还没有阻塞呢，就对它进行了唤醒
                 */
                if(this.product <= 20)
                {
                    this.product++;
                    System.out.println("生成者生产了第"+Integer.toString(this.product));
                }
                else
                {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
    public void getProduct()
    {
        while(true)
        {
            try {
                Thread.sleep((long) (Math.random()*100));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (this)
            {
                notifyAll();
                if(this.product >= 0)
                {
                    System.out.println("消费者消费了第" + Integer.toString(this.product));
                    this.product--;
                }
                else
                {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}

class Productor implements Runnable{
    Clerk clerk;
    public void setClerk(Clerk clerk)
    {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        clerk.addProduct();
    }
}

class Customer implements Runnable{
    Clerk clerk;
    public void setClerk(Clerk clerk)
    {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        clerk.getProduct();
    }
}

public class product_and_customer {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Productor productor = new Productor();
        Customer customer = new Customer();
        productor.setClerk(clerk);
        customer.setClerk(clerk);
        new Thread(productor).start();
        new Thread(customer).start();
    }
}
