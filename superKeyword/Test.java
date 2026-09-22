package java_opps.superKeyword;

public class Test {

  int a = 20;

}

class TestB extends Test {
  int a = 10;

  void show(int a) {
    System.out.println(super.a); // use of super keyword
    System.out.println(this.a); // use of this keyword
    System.out.println(a); //
  }

  public static void main(String[] args) {
    TestB t = new TestB();
    t.show(30);

  }

}
