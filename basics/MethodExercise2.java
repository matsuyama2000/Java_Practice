// write a program that prints the prime numbers between 2 numbers

// divide the method into multiple reuseable method
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MethodExercise2 {
  public static void main(String[] args) {
    System.out.println("Please enter startNum: ");
    int startNum = new Scanner(System.in).nextInt();

    System.out.println("Please enter endNum: ");
    int endNum = new Scanner(System.in).nextInt();

    System.out.println("Prime numbers between " + startNum + " and " + endNum + ":" + findPrimesBetween(startNum, endNum));
  }

  public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;

    // check divisibility by numbers of the form 6k ± 1
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0)
            return false; // If divisible by any of these, not prime
    }
    return true; // if not divisible, then prime
  }

  public static List<Integer> findPrimesBetween(int startNum, int endNum) {
    // initialize an empty ArrayList
    List<Integer> primes = new ArrayList<>();

    for (int num = startNum; num <= endNum; num++) {
      if (isPrime(num)) {
        primes.add(num);
      }
    }

    return primes;
  }
}