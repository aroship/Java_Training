 class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class PayrollCalculator{
    public double calculateMonthlySalary(Employee employee) {

        return employee.getSalary();
    }


}
public class SRPExample{
    public static void main (String[] args){
        Employee employee=new Employee("Aroshi",20000);
        PayrollCalculator calculator= new PayrollCalculator();

        double monthlySalary= calculator.calculateMonthlySalary(employee);
        System.out.println("Monthly salary of "+ employee.getName() +" is "+ monthlySalary);
    }
}

