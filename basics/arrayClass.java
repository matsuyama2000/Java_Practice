import java.util.Arrays;

// sort(array)
int[] numbers = {5, 2, 3, -1, 0, 4, 1};
Arrays.sort(numbers); // [-1, 0, 1, 2, 3, 4, 5]


char[] characters = {'a,', 'x', 'b', 'z', 'y', 'c', 'D', 'A', 'Z', 'C' };
Arrays.sort(characters); // [A, C, D, Z, a, b, c, x, y, z]

// sort(array, fromIndex(inclusive), toIndex(exclusive))
int[] scores = {5, 4, 3, 2, 1, 0, -1}; // 3, 6 + 1
Arrays.sort(scores, 3, 7) // {5, 4, 3, -1, 0, 1, 2}

// Sorts array of strings lexically
String[] names = {"hij", "abc", "efg"};
Arrays.sort(names); // [abc, efg, hij]

// u need to create a custom compareTo() method in Point class
Point[] points = {new Point(1, 2), new Point(3, 4), new Point(-1, -2)};
Arrays.sort(points); // error

// binarySearch(array, element)
// the array should be sorted in increasing order
// return values: 
  // index of the element inside the array if exists
  // -(insertionIndex + 1) if the element was not found: {1, 2, 3, 5, 6, 7} -> {1, 2, 3, 4, 5, 6, 7}

int[] numbersExample = {5, 4, 3, 2, 1, 0, -1};
Arrays.sort(numbersExample); // [-1, 0, 1, 2, 3, 4, 5]
System.out.println(Arrays.binarySearch(numbersExample, 4)); // 5
System.out.println(Arrays.binarySearch(numbersExample, 3)); // 4
System.out.println(Arrays.binarySearch(numbersExample, -3)); // -(0 + 1) -> -1
System.out.println(Arrays.binarySearch(numbersExample, 6)); // - (7 + 1) -> -8

String[] houses = {'a', 'b', 'c'};
System.out.println(Arrays.binarySearch(houses, 'a')); // 0
System.out.println(Arrays.binarySearch(houses, 'c')); // 2
System.out.println(Arrays.binarySearch(houses, 'A')); // -(0 + 1) -> -1
System.out.println(Arrays.binarySearch(houses, 'd')); // -(3 + 1) -> -4