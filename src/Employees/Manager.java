package Employees;

public class Manager extends Employee {
    public Manager (String fullName, Double rate, int daysWorked){
        super(fullName,rate,daysWorked);
    }

    @Override
    public double getSalaryFull(){
        return rate0/31*daysWorked0*1.15;
    }

    @Override
    public void getSalaryAlone() {
        double salary = rate0/31*daysWorked0*1.15;
        System.out.println(fullName0 + " " + salary);

    }
}
