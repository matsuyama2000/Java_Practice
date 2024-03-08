public class Main {
  public static void main(String[] args) {
    String name = "EMILY";
    boolean result1 = name.equals("emily");
    System.out.println(result1);

    boolean result2 = name.equalsIgnoreCase("emily");
    System.out.println(result2);

    // - - - - - - - - - - - - - - - - -
    String city = "Taipei";
    int num = city.length();
    System.out.println(num);

    // - - - - - - - - - - - - - - - - -
    char nickname = name.charAt(0);
    System.out.println(nickname);

    // - - - - - - - - - - - - - - - - -
    int result3 = city.indexOf("T");
    System.out.println(result3);

    // - - - - - - - - - - - - - - - - -
    boolean result4 = city.isEmpty();
    System.out.println(result4);

    // - - - - - - - - - - - - - - - - -
    String newName = name.toUpperCase();
    System.out.println(newName);

    String newCity = city.toLowerCase();
    System.out.println(newCity);

    // - - - - - - - - - - - - - - - - -
    String area = "    shonan    ";
    System.out.println(area.trim());

    // - - - - - - - - - - - - - - - - -
    String drink = "tea";
    System.out.println(drink.replace('a', 'e'));
    
  }
}