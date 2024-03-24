import java.util.concurrent.atomic.AtomicInteger;

class Counter {

    AtomicInteger count
            = new AtomicInteger();


    public void increment()
    {
        count.incrementAndGet();
    }
}
public class TestCounter {
    public static void main(
            String[] args) throws Exception
    {

        Counter c = new Counter();
        Thread t1 = new Thread(
                new Runnable() {
                    public void run()
                    {
                        for (int i = 1; i <= 1000; i++) {
                            c.increment();
                        }
                    }
                });


        Thread t2 = new Thread(
                new Runnable() {
                    public void run()
                    {
                        for (int i = 1; i <= 1000; i++) {
                            c.increment();
                        }
                    }
                });
        Thread t3 = new Thread(
                new Runnable() {
                    public void run()
                    {
                        for (int i = 1; i <= 1000; i++) {
                            c.increment();
                        }
                    }
                });


        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(c.count);
    }
}
