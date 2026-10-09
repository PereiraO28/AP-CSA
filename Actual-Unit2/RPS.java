import java.util.*;

public class RPS {
  public static void main(String[] args) {

    int numRounds = getRounds()
    int targetScore = numRounds / 2 + 1;
    System.out.println("Playing best of " + numRounds);
    System.out.println("First one to " + targetScore + "wins!")
  }
  public static int getRounds() {
    Scanner readIn = new Scanner(System.in);
    boolean validInput = false;
    int numRounds = 0;

    while (!validInput) {
      System.out.println("How man rounds to play? (e.g. 1, 3, 5...)");
      numRounds = readIn.nextInt();

      if (numRounds > 0 && numRounds % 2 == 1) {
        validInput = true;
      } else {
        System.out.println("Please enter a positive, odd number: ");
      }
    }
    return numRounds;
  }
}
