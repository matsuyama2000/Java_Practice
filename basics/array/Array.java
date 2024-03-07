public class Array {
  public static void main(String[] args){
    String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};

    cars[0] = "Mustang";

    System.out.println(cars[0]);
    System.out.println(cars[3]);

    // ---
    String[] names = new String[3];
    names[0] = "Emily";
    names[1] = "Koko";
    names[2] = "KK";

    for(int i=0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
  }
}