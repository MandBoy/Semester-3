package Services;

import ArrayList.ArraylistExercise;
import Fitness.FitnessExercise;
import Test.*;
import Threads.ThreadExercise;
import Chat.ChatRoom;

public class Program {
    public Program(boolean go) throws Exception {
        System.out.println("--- Opgaver 3;Semester ---");
        go = true;
        while(go){
            menu();
            switch(Inputhandler.intChoice()){
                case 1:
                    FitnessExercise fitnessExercise = new FitnessExercise(go);
                    break;
                case 2:
                    ArraylistExercise arrayExercise = new ArraylistExercise(go);
                    break;
                case 3:
                    ThreadExercise treadExercise = new ThreadExercise();
                    break;
                case 4:
                    ChatRoom chatRoom = new ChatRoom();
                    break;
                case 5:
                    System.out.println("Under construction...");
                    break;
                case 9:
                    go = false;
                    System.out.println("...Shutting down");
                    break;
            }
        }
    }
    public static void menu(){
        String help =
                "1: Fitness Exercise. (Needs read function)\n"+
                "2: ArrayList Exercise. (Finished)\n"+
                "3: Thread Exercise. (Finished)\n"+
                "4: ChatRoom <Semester opgave 1> (Many problems)\n"+
                "5: ChatRoom Test (No problems, taken)\n"+
                "9: Exit/Stop\n";
        System.out.println(help);
    }
}