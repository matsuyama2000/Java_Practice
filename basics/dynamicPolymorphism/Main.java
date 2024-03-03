import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // polymorphism = many shapes/ forms
    // dynamic = after compilation (during runtime)

    // ex: a corvette is: a corvette, a car, a vehicle, an object
    Animal animal;

    Scanner scanner = new Scanner(System.in);
    System.out.println("What animal do you want?");
    System.out.println("(1=dog) or (2=cat): ");
    int choice = scanner.nextInt();

    if (choice == 1) {
      animal = new Dog();
      animal.speak();
    } else if (choice == 2) {
      animal = new Cat();
      animal.speak();
    } else {
      animal = new Animal();
      System.out.println("That choice was invalid");
      animal.speak();
    }
  }
}