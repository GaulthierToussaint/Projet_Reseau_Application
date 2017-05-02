package client;

import java.io.*;
import java.net.Socket;

public class Client {


    public void connect(String adress, int port) throws IOException {
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket(adress,port);

        System.out.println("Connected to "+adress+"/"+port);
        
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

        System.out.print("Command : ");

        String temp = inFromUser.readLine();
        outToServer.writeUTF(temp);
        outToServer.flush();
    }
}
