package javase_chapter8;

/***
 * 20张票，3个用户轮流进行抢票
 * 使用synchronized同步方法实现
 */
class Window4 implements Runnable{
    private int ticket = 100;
    Object obj = new Object();

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
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为" + String.valueOf(ticket));
                    ticket--;
                }
                //注意synchronized位置，保证睡眠之后再进行抢票
            }
            else
            {
                break;
            }

        }
    }
}

public class getticket_synchronize {
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
