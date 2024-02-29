import java.util.Scanner;

public class ifStatement {
  public static void main(String[] args) {
    System.out.println("Please enter a number: ");

    Scanner s = new Scanner(System.in);
    int userInput = s.nextInt();
    
    if (userInput % 2 == 0) {
      System.out.println("Even Number!");
    } else {
      System.out.println("Odd Number!");
    }
  }
}