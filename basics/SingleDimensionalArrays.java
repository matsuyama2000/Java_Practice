String text; // null
text = "some text";

// create an array
dataType[] arrayName; // null
arrayName = new dataType[10];

dataType[] arrayName = new dataType[10];

int[] numbers = new int[20];

// default value
// o for numeric primitive data types
// \u0000 for char types
// false for boolean types
// null for reference type

// access array elements
int[] numbers = new int[5]; // {0, 0, 0, 0, 0}
numbers[0] = 5; // {5, 0, 0, 0, 0}

// array initializers
double[] numbers = {1.9, 2.9, 3.4, 2.5};

double[] numbers = new double[4];
numbers[0] = 1.9;
numbers[1] = 2.9;

// error
double[] numbers;
numbers = {1.9, 2.9, 3.4, 2.5}; // error

// print arrays
int[] scores = {5, 0, 3, 10};
System.out.println(scores); // address

for (int = 0; i < scores.length; i++) {
  System.out.println(scores[i] + " ");
}

// anonymous arrays
new int[] {1, 2, 3, 4};
printArray(new int[] {1, 2, 3, 4});

// exceeding array bounds
char[] chars = {'a', 'b', 'c', 'd'};
System.out.println(chars[-1]); // out of bounds
System.out.println(chars[4]); // out of bounds

// passing arrays to methods
public static void main(String[] args) {
  int[] badmintonScores = {0, 1};
  change(badmintonScores);
  printArray(badmintonScores);
}

public static void change(int[] numbers) {
  numbers[0] = 1; // {1, 1}
  numbers[1] = 0; // {1, 0}
}

public static void printArray(int[] numbers) {
  for(int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
  }
}

// x no longer exists after the method is executed
public static int getNumber() {
  int x = 1;
  return x;
}

// as long as p remains in scope and refers to the Point object, it will prevent the object from being garbage collected.

public static void main(String[] args) {
  Point p = getPoint();
  System.out.println(p);
}

public static Point getPoint() {
  return new Point(1, 2);
}

// the following two are the same:
public static int[] getNumbers() {
  int[] numbers = {1, 2, 3, 4, 5};
  return numbers;
}

public static int[] getNumbers() {
  return new int[] {1, 2, 3, 4, 5};
}

// return arrays from methods
public static void main(String[] args) {
  int[] scores = getScores();
  printArray(scores); // 1 2 3 4 5
}

public static int[] getScores() {
  return new int[] {1, 2, 3, 4, 5};
}