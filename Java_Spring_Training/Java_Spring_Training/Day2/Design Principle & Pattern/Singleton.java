
public class Singleton {
    private static Singleton ins;
    private Singleton(){}
    public static Singleton getInstance(){
        if(ins==null)
            ins=new Singleton();
        return ins;
    }

    public static void main(String args[]){
        Singleton ins1= Singleton.getInstance();
        Singleton ins2= Singleton.getInstance();

        if(ins1 == ins2){
            System.out.println("Its the same instance");
        }

    }
}
