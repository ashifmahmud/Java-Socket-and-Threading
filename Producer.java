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
public class Producer  implements Runnable{
    
    BlockingQueue<String> q;
    Thread t;
    String name;
    
    Producer(BlockingQueue<String> q, String name){
        this.q = q;
        this.name = name;
        t = new Thread(this,name);
        t.start();
    }
    
    @Override
    public void run(){
        System.out.println(name+" started...");
        int i = 0;
        
        while(true){
            try{
                if(q.size()>=4){
                    System.out.println(name+": Queue is full");
                    Thread.sleep(2000);
                }
                i++;
                q.put("kitkat "+i);
                System.out.println(name+" created kitkat "+i);
                Thread.sleep(300);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
    }
    
}
