package ArrayList;
import Services.Inputhandler;

import java.util.LinkedList;

public class ArraylistExercise{
    private LinkedList<Integer> liste = new LinkedList<Integer>();

    public ArraylistExercise(boolean go) throws Exception {
        go = true;
        while(go){
            menu();
            switch(Inputhandler.intChoice()){
                case 1:
                    liste.add(createNumber());
                    break;
                case 2:
                    readNumber();
                    break;
                case 3:
                    updateNumber();
                    break;
                case 4:
                    deleteNumber();
                    break;
                case 9:
                    go = false;
                    break;
            }
        }
    }
    public static void menu(){
        String menu =
                "1: Add number\n"+
                "2; Read number\n"+
                "3: Update number\n"+
                "4: Delete number\n"+
                "9: Exit/Stop\n";
        System.out.println(menu);
    }
    public int createNumber(){
        System.out.print("What number do you want to add? : ");
        int number = Inputhandler.intChoice();
        return number;
    }
    public void readNumber(){
        for(Integer in : liste){
            System.out.println(in);
        }
    }
    public void updateNumber(){ /* Exception */
        System.out.println("What number do you want to update?");
        for(Integer in : liste){
            System.out.println(in);
        }
        int number = Inputhandler.intChoice();
        if(number > liste.size() || number < liste.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            System.out.print("What is the new number? : ");
            int newNumber = Inputhandler.intChoice();
            liste.set(number, newNumber);
        }
    }
    public void deleteNumber(){
        System.out.print("What number do you want to delete? : ");
        int number = Inputhandler.intChoice();
        if(number > liste.size() || number < liste.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            System.out.print("What is the new number? : ");
            int newNumber = Inputhandler.intChoice();
            liste.set(number, newNumber);
        }
        liste.remove(number);
    }
}
