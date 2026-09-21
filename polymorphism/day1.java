package java_opps.polymorphism;

// Different number of parameter

public class day1 {
  void show(int a ){

  System.out.println("hello");
  }

  void show(int b , int a){
    System.out.println("Hello rudra");
  }

  public static void main(String [] args){
    day1 d = new day1();
    d.show(10 , 20);
  
  } 
  
}
