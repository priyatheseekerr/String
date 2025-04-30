import java.util.Scanner;
//	Change case of each character in a string
public class CaseChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                System.out.print(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                System.out.print(Character.toLowerCase(ch));
            } else {
                System.out.print(ch);
            }
        }
        sc.close();
    }
}
