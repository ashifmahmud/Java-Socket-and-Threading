/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class Clients {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Client started...");
        Socket soc = new Socket("127.0.0.1",21212);
        System.out.println("Client Connected...");
        
        ObjectOutputStream oos = new ObjectOutputStream(soc.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(soc.getInputStream());
        
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        oos.writeObject(message);
        
        try{
            Object fromServer = ois.readObject();
            System.out.println("From server: "+(String)fromServer);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
