
//Count number of vowels, consonants, spaces in String
import java.util.Scanner;

public class cvsCount {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a word: ");
      String word = sc.nextLine();

      int spaceCount = 0;
      int vowelsCount = 0;
      int consonantCount = 0;

      for (int i = 0; i < word.length(); i++) {
         char ch = word.charAt(i);
         if (ch == ' ') {
            spaceCount++;
         } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
               || ch == 'o' || ch == 'u') {
            vowelsCount++;
         } else if (Character.isLetter(ch)) {
            consonantCount++;
         }
      }
      System.out.println("spaceCount: " + spaceCount);
      System.out.println("vowelsCount: " + vowelsCount);
      System.out.println("consonantCount: " + consonantCount);
      sc.close();
   }
}
