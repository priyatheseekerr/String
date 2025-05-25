import java.util.Scanner;
//Check if Two Strings are Case-Insensitive Equal
public class ConsecutiveDupliacte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.next();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                word.append(str.charAt(i));
            }
        }
        word.append(str.charAt(str.length() - 1));
        System.out.println(word);
        sc.close();
    }
}
