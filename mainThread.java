/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture07;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */

class subThread implements Runnable{
    Thread st;
    private String subName;
    
    subThread(String name){
        
        subName = name;
    }
    
    @Override
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println(i);
            System.out.println(subName);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(mainThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    public void start(){
        System.out.println("Thread started...");
        
        if(st == null){
            st = new Thread(this,subName);
            st.start();
        }
    }
}
public class mainThread {
    
    public static void main(String[] args) {
        
        subThread t1 = new subThread("t1");
     
        subThread t2 = new subThread("t2");
        
        t1.start();
        t2.start();
        
       
        System.out.println("Out of thread");
        
        
    }

    }
    

