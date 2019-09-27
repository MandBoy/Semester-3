package Fitness;

import Services.Inputhandler;

public class Member extends Person {
    private boolean isBasic;

    public Member(){
        System.out.print("Persons MemberShip : ");  this.isBasic = Inputhandler.boolChoice();
    }

    public String getMemberType(){
        if(this.isBasic == true){
            return "Basic";
        }
        else{
            return "Full";
        }
    }
    public int getMonthleyFee(){
        if(this.isBasic == true){
            return 199;
        }
        else{
            return 299;
        }
    }
}
