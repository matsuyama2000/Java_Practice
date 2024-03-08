import java.util.*;

public class Main {
  public static void main(String[] args){
    
    // 2D ArrayList = a dynamic list of lists
    // You can change the size of these lists during runtime


    ArrayList<ArrayList> groceryList = new ArrayList();

    ArrayList<String> bakeryList = new ArrayList();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");

    ArrayList<String> produceList = new ArrayList();
    produceList.add("tomatoes");
    produceList.add("zucchini");
    produceList.add("peppers");

    ArrayList<String> drinkList = new ArrayList();
    drinkList.add("soda");
    drinkList.add("coffee");

    // System.out.println(bakeryList.get(0));
    // System.out.println(drinkList);

    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinkList);

    System.out.println(groceryList);
    System.out.println(groceryList.get(0));
    System.out.println(groceryList.get(0).get(0));
    System.out.println(groceryList.get(0).get(1));
  }
}