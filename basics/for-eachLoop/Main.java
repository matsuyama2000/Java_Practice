import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
  
    // for-each = traversing technique to iterate through the elements in an array/ collection
    //            less steps, more readable
    //            less flexible

    // String[] animals = {"cat", "dog", "rat", "bird"};

    // for(String i : animals) {
    //   System.out.println(i);
    // }

    ArrayList<String> drinks = new ArrayList<String>();
    drinks.add("coffee");
    drinks.add("milk");
    drinks.add("juice");

    for(String i : drinks) {
      System.out.println(i);
    }
  }
}