import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Find Common Characters in Two Strings
public class CommonCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string 1:");
        String str = sc.nextLine();
        System.out.println("Enter the string 2:");
        String str1 = sc.nextLine();
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        for (char ch : str1.toCharArray()) {
            if (set.contains(ch)) {
                System.out.print(ch + " ");
                set.remove(ch);
            }
        }
        sc.close();
    }
}
