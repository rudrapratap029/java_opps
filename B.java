package java_opps;

public class B {

  void show() {
    System.out.println(" shows A method");
  }

}

class C extends A {
  public void run() {
    System.out.println("Hey");
  }

}

class D extends A {
  public static void main(String[] args) {
    C c = new C();
    c.show();
    c.run();

  }
}
