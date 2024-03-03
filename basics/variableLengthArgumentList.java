public static void main(String[] args) {
  System.out.println( sum(1, 7) ); // 8
  System.out.println( sum(1, 9, -1) ); // 9
}

// example
public static int sum(int... numbers) {
  int sum = 0;
  for(int i = 0; i < numbers.length; i++) {
    sum += numbers[i];
  }
  return sum;
}

// example
System.out.println( sum(1, 7, -2) ); // 6

int[] numbers = {1, 7, -2};
System.out.println( sum(numbers) ); // 6

System.out.println( sum( new int[] {1, 7, -2} ) ); // 6

// example
void print(String... string, double... numbers) // error (only 1 is accepted)
void print(double...numbers, String name) // error (must be the last param)
void print(String name, double... numbers) // ok!