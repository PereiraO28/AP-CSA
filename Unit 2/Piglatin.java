import java.util.Scanner;

public class Piglatin {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = readIn.next();

        boolean startsWithVowel = word.substring(0, 1).equals("a") ||
                                  word.substring(0, 1).equals("e") ||
                                  word.substring(0, 1).equals("i") ||
                                  word.substring(0, 1).equals("o") ||
                                  word.substring(0, 1).equals("u");

        if (startsWithVowel) {
            System.out.println(word + "way");
        } else if (word.equals("lorenzo")) {
            System.out.println("Lorenbumzoway");
        } else {
            System.out.println(word.substring(1) + word.substring(0, 1) + "ay");
        }

        readIn.close();
    }
}
