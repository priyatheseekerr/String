import java.util.Scanner;
//	Print all the duplicates in the input string.
public class duplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String word = sc.nextLine();
        String str = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (word.indexOf(ch) != word.lastIndexOf(ch)) {
                if (str.indexOf(ch) == -1) {
                    str += ch;
                    System.out.print(ch + " ");
                }
            }
        }
        sc.close();
    }
}
