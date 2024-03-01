// write a method that gets the name of the user and a method that gets the age of user.

import java.util.Scanner;

public class MethodExercise1 {
  public static void main(String[] args) {
    System.out.println("Please enter your and age: ");
    System.out.println(getName() + " " + getAge());
  }

  public static String getName() {
    return new Scanner(System.in).nextLine();
  }

  public static double getAge() {
    return new Scanner(System.in).nextDouble();
  }

}