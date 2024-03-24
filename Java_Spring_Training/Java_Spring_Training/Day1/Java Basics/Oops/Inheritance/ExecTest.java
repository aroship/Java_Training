import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecTest {
    public static int val=0;
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.execute(()->{
            System.out.println("IN 1");
            for(int i =0;i<1000;i++){
                val=val+1;
            }
        });
        executorService.execute(()->{
            System.out.println("IN 2");
            for(int i =0;i<1000;i++){
                val=val+1;
            }
        });
        executorService.execute(()->{
            System.out.println("IN 3");
            for(int i =0;i<1000;i++){
                val=val+1;
            }
        });
        executorService.execute(()->{
            System.out.println("IN 4");
            for(int i =0;i<1000;i++){
                val=val+1;
            }
        });
        executorService.execute(()->{
            System.out.println("IN 5");
            for(int i =0;i<1000;i++){
                val=val+1;
            }
        });
        executorService.execute(()->{
            System.out.println("IN 6");
            for(int i =0;i<1000;i++){
                val=val+1;
            }
        });



        executorService.shutdown();
        System.out.println(val);

    }

}
