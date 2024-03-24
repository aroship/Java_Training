import java.time.Duration;

public class Synchronized {
    public static void main(String[] args){
        Thread t1= new Thread(() -> {
            try{
                print();
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        Thread t2= new Thread(() -> {
            try{
                print();
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        Thread t3= new Thread(() -> {
            try{
                print();
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
        t3.start();


    }
    public synchronized static void print() throws InterruptedException{
        System.out.println("inside print start"+ Thread.currentThread().getName());
                Thread.sleep(5000);
        System.out.println("inside print start"+ Thread.currentThread().getName());
    }
}
