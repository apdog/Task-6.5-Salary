package Employees;

public class Employee {
    protected String fullName0;
    protected double rate0;
    protected int daysWorked0;
    protected double salary;

    public Employee (String fullName, Double rate, int daysWorked){
        this.fullName0 = fullName;
        this.rate0 = rate;
        this.daysWorked0 = daysWorked;
    }

    public void getSalaryAlone(){
        double salary = rate0/31*daysWorked0;
        System.out.println(fullName0 + " " + salary);
    }

    public double getSalaryFull(){
        return salary = rate0/31*daysWorked0;
    }


}
