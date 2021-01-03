import java.util.*;
public class PigLatin {
  public static void main(String[]args){
    //Test
    // System.out.println(pigLatinSimple("mock"));
    // System.out.println(pigLatinSimple("pie"));
    // System.out.println(pigLatinSimple("david"));
    // System.out.println(pigLatinSimple("aaron"));

    // System.out.println(pigLatin("Block"));
    // System.out.println(pigLatin("Nay"));
    // System.out.println(pigLatin("Say"));
    // System.out.println(pigLatin("iphone"));
    // System.out.println(pigLatin("the"));
    // System.out.println(pigLatin("check"));
    // System.out.println(pigLatin("skee"));
    // System.out.println(pigLatin("emu"));
    // System.out.println(pigLatin("grade"));

    // System.out.println(pigLatinBest("*emu"));
    // System.out.println(pigLatinBest("4chan"));
    // System.out.println(pigLatinBest("fish!"));
    // System.out.println(pigLatinBest("fish"));
    // System.out.println(pigLatinBest("the."));
    // System.out.println(pigLatinBest("cat!"));
    // System.out.println(pigLatinBest("amazing?"));
    // System.out.println(pigLatinBest("apple%"));

    //Running the sonnet
    Scanner scanner = new Scanner(System.in);
      while (scanner.hasNextLine()) {
        Scanner line = new Scanner(scanner.nextLine());
        while (line.hasNext()) {
          System.out.print(pigLatinBest(line.next()));
          if (line.hasNext()){
            System.out.print(" ");
          }
        }
        if (scanner.hasNextLine()){
          System.out.println();
        }
      }
  }

  public static String pigLatinSimple(String s){
    char first = s.charAt(0);
    String[] vowels = new String[] {"a", "e", "i", "o", "u"};
    for (int i = 0; i < vowels.length; i++) {
      if (s.substring(0, 1).equals(vowels[i])) {
        return s + "hay";
      }
    }
    return s.substring(1) + first + "ay";
  }

  public static String pigLatin(String s){
    boolean hasDigraph = false;
    s = s.toLowerCase();
    if (s.length() < 2){
      return pigLatinSimple(s);
    }
    String digraph = s.substring(0,2);
    String[] digraphs = new String[] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (int i = 0; i < digraphs.length; i++){
      if (s.substring(0,2).equals(digraphs[i])){
        hasDigraph = true;
      }
    }
    if (hasDigraph==true){
      return s.substring(2) + digraph + "ay";
    }
    else {
      return pigLatinSimple(s);
    }
  }

  public static String pigLatinBest(String s){
    boolean hasLetter = false;
    boolean hasNum = false;
    int strL = s.length();
    String[] letters = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String[] numbers = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    int l = letters.length;
    int numL = numbers.length;
    s = s.toLowerCase();
    for (int i = 0; i < l; i++){
      if (s.substring(strL-1).equals(letters[i])){
        hasLetter = true;
      }
    }
    for (int i = 0; i < numL; i++){
      if (s.substring(strL-1).equals(numbers[i])){
        hasNum = true;
      }
    }
    if(!Character.isLetter(s.charAt(0))){
      return s;
    }
    else if (hasLetter==true || hasNum==true){
      return pigLatin(s);
    }
    else {
      return pigLatin(s.substring(0,strL-1)) + (s.substring(strL-1));
    }
  }

}
