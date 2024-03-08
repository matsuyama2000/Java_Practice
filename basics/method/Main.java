public class Main {
  public static void main(String[] args){

    String name = "Emily";
    int age = 24;

    hello(name, age);

  }

  static void hello(String username, int age) {
    System.out.println("Hello, " + username);
    System.out.println("You are " + age);
  }
}