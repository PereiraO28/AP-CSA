import java.util.*;

public class PassswordGame {
  public static void main(String[] args) {
    Scanner reanIn = new Scanner(System.in);
    String password = readIn.next();


    //must be a length of 5
    boolean passRule1 = checkRule1(password);
    if (passRule1 = checkRule1(password)) {
      System.out.println("PASS: you password has at least 5 characters");
    } else {
      System.out.println("FAIL: you password has at needs least 5 characters");
    }
  }

  public static boolean checkRule1(String $) {
    return $.length() >= 5;
  }
}
