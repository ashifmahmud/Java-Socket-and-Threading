/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture06;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Acer
 */
public class Server {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(20000);
        System.out.println("Server started...");
        
        while(true){
        Socket socket = serverSocket.accept();
        System.out.println("Client connected...");
        
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        
        try{
            Object client = ois.readObject();
            System.out.println("From Client: "+(String)client);
            String serverMsg = (String)client;
            serverMsg = serverMsg.toUpperCase();
            
            oos.writeObject(serverMsg);
            
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
            
        }
        }
        
    }
    
}
