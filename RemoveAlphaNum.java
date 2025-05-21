import java.util.Scanner;
//	Remove All Non-Alphanumeric Characters
public class RemoveAlphaNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String word = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (char ch : word.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
        sc.close();
    }
}
