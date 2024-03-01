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

// print arrays
int[] scores = {5, 0, 3, 10};
System.out.println(scores); // address

for (int = 0; i < scores.length; i++) {
  System.out.println(scores[i] + " ");
}
