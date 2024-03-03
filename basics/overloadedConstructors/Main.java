public class Main {
  public static void main(String[] args) {

    // overloaded constructors = multiple constructors with a class with the same name, but have dif params

    Pizza myPizza = new Pizza("thicc crust", "tomato");

    System.out.println("Here are the ingredients of your pizza: ");

    System.out.println(myPizza.bread);
    System.out.println(myPizza.sauce);
    System.out.println(myPizza.cheese);
    System.out.println(myPizza.topping);
  }
}