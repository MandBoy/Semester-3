package Chat;

import Services.Inputhandler;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Login{
    private String serverIp;
    private int serverPort;

    public Login(boolean go){
        while(go){
            login();
        }
    }

    public void login(){
        System.out.print("Enter server ip : "); String serverIp = Inputhandler.strChoice();
        System.out.print("Enter server Port : "); int serverPort = Inputhandler.intChoice();
        try{
            Socket socket = new Socket(serverIp,serverPort);
        }
        catch(UnknownHostException e){
            System.out.println("Host Ip error...");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("Host port error...");
            e.printStackTrace();
        }

    }
}
