package java_opps;

public class A {

  void show() {
    System.out.println(" shows A method");
  }

}

class B extends A {
  public void run() {
    System.out.println("Hey");
  }

}

class C extends B {
  public static void main(String[] args) {
    C c = new C();
    c.show();
    c.run();

  }
}