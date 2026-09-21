package java_opps;

public class Constructer {
  String name;
  int id;

  public Constructer(String name, int id) {
    this.name = name;
    this.id = id;

  }

  public static void main(String[] args) {
    Constructer c1 = new Constructer("Rudra", 5);
    System.out.println("Nmae = " + c1.name + " ID= " + c1.id);

  }

}