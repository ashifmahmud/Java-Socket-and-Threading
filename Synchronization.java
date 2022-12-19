/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture08;

/**
 *
 * @author Acer
 */

class Printer{
    void printAssignment(Person p){
        System.out.println(p.name + "-->printing started...");
        
        for(int i = 1; i<=p.pages; i++){
            System.out.println(p.name+"--> printed page #"+i);
    }
        
        System.out.println(p.name+" Printing completed...");
    }
    
    
    
}

class Person implements Runnable{
    String name;
    final Printer printer;
    int pages;
    Thread t;
    
    Person(String name, Printer p, int pages){
        this.name = name;
        this.printer = p;
        this.pages = pages;
        t = new Thread(this, name);
        t.start();
    }
    
    @Override
    public void run(){
        synchronized (printer){
        printer.printAssignment(this);
        }
    }
}
public class Synchronization {
    public static void main(String[] args) {
        
        Printer printer = new Printer();
        Person tanvir = new Person("tanvir",printer, 6);
        Person Rakib = new Person("rakib",printer,8);
    }
    
}
