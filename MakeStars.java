import java.util.*;
public class MakeStars {

  public static void main(String[] args) {
    Scanner file = new Scanner(System.in);
    while (file.hasNextLine()){
      Scanner line = new Scanner(file.nextLine());
      String output = "";
      while (line.hasNext()){
        String word = line.next();
        for (int i = 0; i < word.length(); i++){
          output += "*";
        }
        if(line.hasNext()) {
          output += " ";
        }
      }
      System.out.println(output);
    }
  }
}
