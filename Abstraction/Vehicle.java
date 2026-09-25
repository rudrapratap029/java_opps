package java_opps.Abstraction;

 abstract class Vehicle {

  abstract void start();

 }

  class Car extends Vehicle{
    void start(){
      System.out.println("Car is start with key");
     
    }

  }

  class Scooter extends Vehicle{
    void start(){
      System.out.println("scooter start with Kick");
    }
    public static void main(String[] args){
      Car c = new Car();
      
      c.start();
      Scooter s = new Scooter();
      s.start();
    }

  }
  

