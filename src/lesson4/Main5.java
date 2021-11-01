package lesson4;

public class Main5 {
    public static void main(String[] args) {
        String text = "Some text in english";

      String[]words =  text.split(" ");
      for (int i = words.length - 1 ; i>=0;i--){

          System.out.println(words[i]);

      }
    }
}
