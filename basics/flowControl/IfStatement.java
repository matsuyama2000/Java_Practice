import java.util.Scanner;

public class IfStatement {
  public static void main(String[] args) {
    System.out.println("Please enter a number: ");

    Scanner s = new Scanner(System.in);

    if (s.nextInt() % 2 == 0) {
      System.out.println("Even Number!");
    } else {
      System.out.println("Odd Number!");
    }
  }
}