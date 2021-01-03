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
  }

  public static String pigLatinSimple(String s){
    boolean vowel = false;
    s = s.toLowerCase();
    char first = s.charAt(0);
    if (s.substring(0,1).equals("a") || s.substring(0,1).equals("e") || s.substring(0,1).equals("i") || s.substring(0,1).equals("o") || s.substring(0,1).equals("u")){
        vowel = true;
    }
    else if (!(s.substring(0,1).equals("a") || s.substring(0,1).equals("e") || s.substring(0,1).equals("i") || s.substring(0,1).equals("o") || s.substring(0,1).equals("u"))){
        vowel = false;
    }
    if (vowel==true){
      return s + "hay";
    }
    else {
      return s.substring(1) + first + "ay";
    }
  }

  public static String pigLatin(String s){
    boolean hasDigraph = false;
    s = s.toLowerCase();
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

}
