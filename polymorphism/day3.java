package java_opps.polymorphism;
//  Method Overloading  Different type of parameter 

public class day3 {
  void show(int a ){
    System.out.println("Different type of parameters 1");

  }
  void show(String b){
    System.out.println("Different type of parameters 2");
  }
  public static void main(String[] args){
    day3 d3 = new day3();
    d3.show(10);
    d3.show("Rudra");
    d3.show(20);

  }
  
  
}
