import java.util.Random;

// local
// public class DiceRoller {

//   DiceRoller() {
//     Random random = new Random();
//     int number = 0;
//     roll(random, number);
//   }

//   void roll(Random random, int number) {
//     number = random.nextInt(6) + 1;
//     System.out.println(number);
//   }
// }

// global
public class DiceRoller {
  Random random;
  int number; 

  DiceRoller() {
    random = new Random();
    roll();
  }

  void roll() {
    number = random.nextInt(6)+1;
    System.out.println(number);
  }
}