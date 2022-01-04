import Employees.*;

public class Main {
    public static void main(String[] args) {
        Employee[] numb = new Employee[4];
        numb [0] = new Head("Хапугин Алексей Николаевич",90000d,31);
        numb [1] = new Cleaner("Силкина Лидия Степановна",30000d,24);
        numb [2] = new Accountant("Белюкин Михаил Станиславович",50000d,31);
        numb [3] = new Manager("Мартынович Анна Александровна",55000d,31);

        for (int i=0; i<numb.length; i++)
            numb[i].getSalaryAlone();

        double totalSalary=0;
        for (int i=0; i<numb.length; i++)
            totalSalary += numb[i].getSalaryFull();
        System.out.println("Общая сумма выплаты по зарплатам: " + totalSalary);
    }
}
