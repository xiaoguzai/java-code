package javase_chapter8;

class Window3 implements Runnable{
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while(true)
        {
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            if(ticket > 0)
            {
                show();
            }
            else
            {
                break;
            }
        }
    }

    private synchronized void show()
    {
        System.out.println(Thread.currentThread().getName()+":买票"+String.valueOf(ticket));
        ticket--;
    }
}

public class getticket_synchronized2 {
    public static void main(String[] args) {
        Window3 w = new Window3();

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