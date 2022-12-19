/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture05;

/**
 *
 * @author Acer
 */
//inheritance
class Vehicle{
    
    String brand;
    String model;
    String color;
    int numOfWheels;
    String type;
    
    Vehicle(String brand, String model, String color, int numOfWheels, String type){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numOfWheels = numOfWheels;
        this.type = type;
        
        
        
    }
    
    public void honk(){
        System.out.println("Peep peep!!!");
    }
}
class Car extends Vehicle{
    
    
    Car(String brand, String model, String color, int numOfWheels, String type){
        super(brand,model,color,numOfWheels, type);
        
    }
    
    public void Speed(int speed){
        System.out.println("the speed of the car is "+speed);
    }
}
//multi level
class Animal{
    public void Type(){
        System.out.println("this is an animal");
    }
}
class Cat extends Animal{
    public void Legs(){
        System.out.println("It has 4 legs");
    }
}
class Parasite extends Cat{
    public void Size(){
        System.out.println("It's size is so small");
    }
}


//polymorphism

abstract class Fruit{
    
    public abstract void fruitColor();
    
}
class Mango extends Fruit{
    @Override public void fruitColor(){
        System.out.println("This fruit color is green");
    }
}

class Orange extends Fruit{
    @Override public void fruitColor(){
        System.out.println("This fruit color is Orange");
    }
}


public class Lecture05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car myCar = new Car("toyota","supra","black",4,"sports");
        
        System.out.println(myCar.model);
        
        myCar.honk();
        
        Parasite p = new Parasite();
        p.Type();
        p.Legs();
        
        Orange o = new Orange();
        o.fruitColor();
        
        Mango m = new Mango();
        m.fruitColor();
        
    }
    
}
