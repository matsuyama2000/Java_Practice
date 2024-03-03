public class Main {
  public static void main(String[] args) {
    // interface = a template that can be applied to a class.
    //             similar to inheritance, but specifies what a class has/ must do.
    //             classes can apply more than one interfaces, while inheritance is limited to 1 super class.

    Rabbit myLittleRabbit = new Rabbit();
    myLittleRabbit.flee();

    Hawk enoshimaHawk = new Hawk();
    enoshimaHawk.hunt();
    // enoshimaHawk.flee(); // error

    Fish yu = new Fish();
    yu.hunt();
    yu.flee();
  }
}