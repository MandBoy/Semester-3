package Fitness;

import Services.Inputhandler;

public class FitnessExercise{
    public FitnessExercise(boolean go){
        go = true;
        while(go){
            helper();
            switch(Inputhandler.intChoice()){
                case 1:
                    Create create = new Create(go);
                    break;
                case 2:
                    System.out.println("Reader goes here");
                    break;
                case 9:
                    go = false;
                    break;
            }
        }
    }
    public void helper(){
        String help =
                "1: Create People\n"+
                "2: Read People\n"+
                "9: Exit/Stop\n";
        System.out.println(help);
    }
}
