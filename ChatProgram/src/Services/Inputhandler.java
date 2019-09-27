package Services;

import java.util.*;

public class Inputhandler{
    public static Scanner scanner = new Scanner(System.in);

    public static String strChoice(){
        String str = scanner.next();
        return str;
    }
    public static int intChoice() {
        while(!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();
    }
    public static double douChoice() {
        while(!scanner.hasNextDouble()) {
            scanner.next();
        }
        return scanner.nextDouble();
    }
    public static boolean boolChoice(){
        int num = scanner.nextInt();
        if(num == 0){
            return false;
        }
        else{
            return true;
        }
    }
}