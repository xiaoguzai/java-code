package javase_chapter8;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*创建多线程的方式：
1.继承Thread
2.实现Runnable
3.实现Callable
4.使用线程池

*/
class MyThread01 extends Thread {
    @Override
    public void run() {
        System.out.println("-----MyThread01");
    }
}

class MyThread02 implements Runnable {
    public void run() {
        System.out.println("-----MyThread02");
    }
}

class MyThread03 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("-----MyThread03");
        return 200;
    }
}

public class thread_callable {
    public static void main(String[] args) {
        new MyThread01().start();
        new Thread(new MyThread02()).start();

        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread03());
        //将此Callable接口实现的类对象作为传递到FutureTask构造器中，创建FutureTask对象
        new Thread(futureTask).start();

        Integer value = null;
        try {
            value = futureTask.get();
            System.out.println(value);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}