public class Main {
  public static void main(String[] args) {

    Car myCar = new Car("Toyota", "latest2024", 2024);

    // System.out.println(myCar.make); // error
    System.out.println(myCar.getMake());
    System.out.println(myCar.getYear());

    // myCar.year = 2000; // error
    myCar.setYear(2000);
    System.out.println(myCar.getYear());

  }
}