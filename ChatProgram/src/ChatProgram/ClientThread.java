package ChatProgram;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientThread implements Runnable{
    private Socket socket;
    private PrintWriter clientOut;
    private ChatServer server;

    public ClientThread(ChatServer server, Socket socket){
        this.server = server;
        this.socket = socket;
    }

    private PrintWriter getWriter(){
        return clientOut;
    }

    @Override
    public void run() {
        try{
            Scanner in = new Scanner(socket.getInputStream());
            this.clientOut = new PrintWriter(socket.getOutputStream(), false);
            while(!socket.isClosed()){
                if(in.hasNextLine()){
                    String input = in.nextLine();
                    for(ClientThread theClient : server.getClients()){
                        PrintWriter thatClientOut = theClient.getWriter();
                        if(thatClientOut != null){
                            thatClientOut.write(input + "\r\n");
                            thatClientOut.flush();
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}