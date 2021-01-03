public class PigLatin {
  public static void main(String[]args){
    //Test
    // System.out.println(pigLatinSimple("mock"));
    // System.out.println(pigLatinSimple("pie"));
    // System.out.println(pigLatinSimple("david"));
    // System.out.println(pigLatinSimple("aaron"));
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
}
