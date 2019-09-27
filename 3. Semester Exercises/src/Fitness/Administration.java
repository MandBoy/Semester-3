package Fitness;

import Services.Inputhandler;

public class Administration extends Employee {
    private int vacation;

    public Administration(){
        System.out.print("Administration Vacation : "); this.vacation = Inputhandler.intChoice();
    }
    public int getVacation(){
        return this.vacation;
    }
}
