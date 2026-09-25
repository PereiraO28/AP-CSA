public class Password {
  public static void main(String[] args) {

    String pass = "";

    For (int i = 0; i < 10; i++) {
      in method = (int)(Math.random()*4+1);
      if (method == 1) {
        pass += getRandomUpper();
      } else if (method == 2) {
        pass += getRandomLower();
      } else if (method == 3) {
        pass += getRandomSpecial();
      } else {
        pass += getRandomDigit();
        
      }
    }

    System.out.println(pass);
  }

  public static void getRandomUpper() {
    int num = (int)(Math.random()*26+65);
    String s = new String(new char[] { (char) num });
    return s;
  }

  public static void getRandomLower() {
    int num = (int)(Math.random()*26+97);
    String s = new String(new char[] { (char) num });
    return s;
  }
  public static void getRandomSpecial() {
    String special = "!@#$%^&*()";
    int index = (int)(Math.random()*special.length());
    String s = special.substring(index, index + 1);
    return s;
  }

  public static int getRandom() {
    int digit = (int)(Math.random()*10);
    return digit;
  }
}
