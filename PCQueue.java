/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture07;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author Acer
 */
public class PCQueue {
    public static void main(String[] args) {
        BlockingQueue<String> q = new ArrayBlockingQueue<>(4);
        
        Producer p1 = new Producer(q, "Tanvir");
        Consumer c1 = new Consumer(q, "Rakib");
        Consumer c2 = new Consumer(q,"Akash");
    }
    
}
