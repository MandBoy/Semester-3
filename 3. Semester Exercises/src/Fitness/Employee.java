package Fitness;

import Services.Inputhandler;

public class Employee extends Person {
    private int hours;
    private int salary;

    public Employee(){
        System.out.print("Employee Hours : "); this.hours = Inputhandler.intChoice();
        System.out.print("Employee Salary : "); this.salary = Inputhandler.intChoice();
    }
    public int getHours(){
        return this.hours;
    }
    public int getSalary(){
        return this.salary;
    }
}
