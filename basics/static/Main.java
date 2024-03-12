public class Main {
  public static void main(String[] args){

    // static = modifier. A single copy of a variable/ method is created and shared.
    //          The class "owns" the static member.

    Friend friend1 = new Friend("Koko");
    Friend friend2 = new Friend("Emily");
    Friend friend3 = new Friend("Kk");

    System.out.println(Friend.numberOfFriends);
    Friend.displayFriends();
  }
}