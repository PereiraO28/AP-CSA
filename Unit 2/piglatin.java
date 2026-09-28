Public class piglatin {
  publix static void main(String[] args) {
    Scanner readIn = new Scanner(System.in);
    System.out.print("Enter a word");
    String word = readIn.next();

    bollean startsWithVowel = word.string(0, 1).equals("a")||
                              word.string(0, 1).equals("e")||
                              word.string(0, 1).equals("i")||
                              word.string(0, 1).equals("o")||
                              word.string(0, 1).equals("u");
    
    if (startsWithVolume) {
      System.out.println(word + (way));
    } elif (word == "lorenzo") {
      System.out.println("Lorenbumzoway");
    } else {
      System.out.println(word.substring(1) + word.substring(0,1) + "ay");
    }
  }
}
