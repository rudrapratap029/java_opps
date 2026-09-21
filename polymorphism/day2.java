package java_opps.polymorphism;
// Method Overloading  Different sequence of parameter  

public class day2 {

  void show(int a , String b){
    System.out.println("Diiferent no. of parameter");
  }
  void show(String a , int b){
    System.out.println("Different no. of parameter 2");
  }
  public static void main (String[] args){
    day2 d2 = new day2();
    d2.show(23,"rudra");
      d2.show("rudra", 54);
         d2.show(23,"rudra");
  }
  
}
