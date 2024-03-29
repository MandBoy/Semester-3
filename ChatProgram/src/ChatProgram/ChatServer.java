package ChatProgram;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static final int portNumber = 4444;
    private int serverPort;
    private List<ClientThread> clients;

    public static void main(String[] args){
        ChatServer server = new ChatServer(portNumber);
        server.startServer();
    }

    public ChatServer(int portNumber){
        this.serverPort = portNumber;
    }
    public List<ClientThread> getClients(){
        return clients;
    }

    private void startServer(){
        clients = new ArrayList<ClientThread>();
        try {
            ServerSocket serverSocket = new ServerSocket(serverPort);
            acceptClients(serverSocket);
        } catch (IOException e){
            System.err.println("IOExecption / Port Problem");
            System.exit(1);
        }
    }

    private void acceptClients(ServerSocket serverSocket){
        System.out.println("-Server Is Running-");
        System.out.println("<Users can now join>");
        while(true){
            try{
                Socket socket = serverSocket.accept();
                System.out.println("<Accepted a user>");
                ClientThread client = new ClientThread(this, socket);
                Thread thread = new Thread(client);
                thread.start();
                clients.add(client);
            } catch (IOException ex){
                System.out.println("Accept failed on: " + serverPort);
            }
        }
    }
}
