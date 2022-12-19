/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture07;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Acer
 */
public class Consumer implements Runnable {
    
    BlockingQueue<String> q;
    Thread t;
    String name;
    
    Consumer(BlockingQueue<String> q,String name){
        this.q = q;
        this.name = name;
        t = new Thread(this,name);
        t.start();
    }
    public void run(){
        System.out.println(name+" started...");
        
        while(true){
            try{
                if(q.size()==0){
                    System.out.println(name+": Queue is empty...");
                    Thread.sleep(2000);
                }
                System.out.println(name+" got "+q.take());
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
    
}
