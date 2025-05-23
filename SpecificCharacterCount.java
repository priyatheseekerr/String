import java.util.Scanner;
//	Count Specific Character in a String
public class SpecificCharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character to count: ");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (char s : str.toCharArray()) {
            if (s == ch) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
