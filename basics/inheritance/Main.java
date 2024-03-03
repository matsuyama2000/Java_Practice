public class Main {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.go(); // this vehicle is moving!

    Bicycle myBicycle = new Bicycle();
    myBicycle.stop(); // this vehicle is stopped!

    System.out.println(myCar.speed); // 0.0
    System.out.println(myBicycle.speed); //0.0

    System.out.println(myCar.doors); // 4
    System.out.println(myBicycle.pedals); // 2

  }
}

