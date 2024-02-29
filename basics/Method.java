public class Method {
  public static void main(String[] args) {
    System.out.println("message1");
    // sayHi("Hello"); // error
    sayHi();
    System.out.println(sum(1, 2));
    System.out.println("message1");
  }


  public static void sayHi() {
    System.out.println("Hi");
  }

  public static int sum(int x, int y) {
    return x + y;
  }
}
