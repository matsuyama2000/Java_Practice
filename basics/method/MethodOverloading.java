public class MethodOverloading {
  public static void main(String[] args) {
    sayHi(); // 印出 Hi
    System.out.println(sayHi("Emily")); // 印出 Hello Emily!
  }

  public static void sayHi() {
    System.out.println("Hi");
  }

  public static String sayHi(String name) {
    return "Hello " + name;
  }
}

