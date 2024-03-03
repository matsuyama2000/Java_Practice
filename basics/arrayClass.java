import java.util.Arrays;

// sort(array)
int[] numbers = {5, 2, 3, -1, 0, 4, 1};
Arrays.sort(numbers); // [-1, 0, 1, 2, 3, 4, 5]


char[] characters = {'a,', 'x', 'b', 'z', 'y', 'c', 'D', 'A', 'Z', 'C' };
Arrays.sort(characters); // [A, C, D, Z, a, b, c, x, y, z]

// sort(array, fromIndex(inclusive), toIndex(exclusive))
int[] scores = {5, 4, 3, 2, 1, 0, -1}; // 3, 6 + 1
Arrays.sort(scores, 3, 7) // {5, 4, 3, -1, 0, 1, 2}

//example
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

// example
String[] houses = {'a', 'b', 'c'};
System.out.println(Arrays.binarySearch(houses, 'a')); // 0
System.out.println(Arrays.binarySearch(houses, 'c')); // 2
System.out.println(Arrays.binarySearch(houses, 'A')); // -(0 + 1) -> -1
System.out.println(Arrays.binarySearch(houses, 'd')); // -(3 + 1) -> -4

// equals()
int[] englishScores = {5, 4, 3, 2, 1, 0};
int[] chineseScores = {5, 4, 3, 2, 1, 0};
int[] mathScores = {1, 2, 7, 7, 1, 2};

System.out.println(englishScores == chineseScores); // false (address)

System.out.println(Arrays.equals(englishScores, chineseScores)); // true (elements)

System.out.println(Arrays.equals(englishScores, mathScores)); // false (elements)

// example
String[] strings1 = {'a', 'b', 'c'};
String[] strings2 = {'a', 'b', 'c'};
System.out.println(strings1 == strings2); // false
System.out.println(Arrays.equals(strings1, strings2)); // true

// example
Point[] points1 = {new Point(1, 2), new Point(3, 4)};
Point[] points2 = {new Point(1, 2), new Point(3, 4)};
Point[] points3 = {new Point(0, 0), new Point(3, 4)};

System.out.println(points1 == points2); // false
System.out.println(Arrays.equals(points1, points2)); // true
System.out.println(Arrays.equals(points1, points3)); // false

// example
String ruby = new String("hello");
String java = new String("hello");

System.out.println(ruby == java); // false
System.out.println(ruby.equals(java)); // true

// example
Point shonandai = new Point(1, 2);
Point syonandai = new Point(1, 2);

System.out.println(shonandai == syonandai); // false
System.out.println(shonandai.equals(syonandai)); // true

// fill(array, value)
int[] balance = new int[8]; // {0, 0, 0, 0, 0, 0, 0, 0}
Arrays.fill(balance, 3); // {3, 3, 3, 3, 3, 3, 3, 3}

// fill(array, fromIndex, toIndex, value)
int[] donutsNum = new int[8]; // {0, 0, 0, 0, 0, 0, 0, 0}
Arrays.fill(donutsNum, 3, 7, 5); // {0, 0, 0, 5, 5, 5, 5, 0}

// example
String[] donutsNames = new String[3]; // {null, null, null}
Arrays.fill(donutsNames, "kinako"); // {"kinako", "kinako", "kinako"}

// example
Point[] points = new Point[3]; // {null, null, null}
Arrays.fill(points, 0, 2, new Point(1, 2)); // {(1, 2), (1, 2), null}

// toString()
System.out.println(Arrays.toString(donutsNames)); // ["kinako", "kinako", "kinako"]

System.out.println(Arrays.toString(points)); // [java.awt.Point[x=1, y=2], java.awt.Point[x=1, y=2], null]

int[] historyScores = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(historyScores)); // [1, 2, 3, 4, 5]
