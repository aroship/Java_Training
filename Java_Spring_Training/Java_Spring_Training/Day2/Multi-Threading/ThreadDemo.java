import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    static int i=0;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("In Thread1");

        i=i+1000;

        Thread runner = new Thread(new ThreadRunner6());

        Thread runner1 = new Thread(new ThreadRunner5());

        Thread t1=new Thread();
        t1.start();//main
        runner1.start();
        runner1.join();
        runner.start();
        runner.join();


        System.out.println(i);
    }
}
class ThreadRunner5 extends Thread{
    @Override
    public void run() {
        System.out.println("In Thread2");
        int i = ThreadDemo.i + 1000;
    }

}

class ThreadRunner6 implements Runnable {
    @Override
    public void run() {
        System.out.println("In Thread3");
        int i= ThreadDemo.i+1000;

    }
}