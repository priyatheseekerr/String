import java.util.Scanner;
//Remove All Digits from a String
public class RemoveDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
        sc.close();
    }
}
