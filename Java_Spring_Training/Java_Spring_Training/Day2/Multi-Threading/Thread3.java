import java.util.ArrayList;
import java.util.List;

public class Thread3 {
    static List<Integer> l =new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start");

        l.add(1);
        l.add(2);

        Thread runner = new Thread(new ThreadRunner8());

        Thread runner1 = new Thread(new ThreadRunner7());

        Thread t1=new Thread();
        t1.start();//main
        runner1.start();
        //runner1.join();
        runner.start();
       // runner.join();

        for(int i=0;i<l.size();i++)
            System.out.println(l.get(i));
    }
}
class ThreadRunner7 extends Thread{
    @Override
    public void run() {
        Thread3.l.add(3);
    }

}

class ThreadRunner8 implements Runnable {
    @Override
    public void run() {
        Thread3.l.add(4);

    }
}


//
//class Employee{
//    private String name;
//    private double salary;
//
//    public Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//}
//class PayrollCalculator{
//    public double calculateMonthlySalary(Employee employee) {
//
//        return employee.getSalary();
//    }
//}
//public class SRPExample {
//    public static void main(String[] args){
//        Employee employee= new Employee("Aroshi",20000);
//        PayrollCalculator calculator = new PayrollCalculator();
//
//
//        double monthlySalary = calculator.calculateMonthlySalary(employee);
//
//        System.out.println("Monthly salary of"+employee.getName() +" is " + monthlySalary);
//    }
//}
//

















