package java_opps;

//  Single inhertance ;

class Vehicle {
  void prices() {
    System.out.println("Fortuner has a more price than vehicle");
  }
}

class Carnew extends Vehicle {
  public static void main(String[] args) {
    Carnew c1 = new Carnew();
    Carnew c2 = new Carnew();
    c2.prices();
    c1.prices();
  }
}
