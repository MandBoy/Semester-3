package Fitness;

import Services.Inputhandler;

public class Person{
    protected String name;
    protected String cpr;

    public Person(){
        System.out.print("Person name : "); this.name = Inputhandler.strChoice();
        System.out.print("Person cpr : "); this.cpr = Inputhandler.strChoice();
    }
    public String getName(){
        return this.name;
    }
    public String getCpr(){
        return this.cpr;
    }
}
