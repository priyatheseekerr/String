import java.util.Scanner;
//	Count the Number of Uppercase Letters
public class CountUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = sc.nextLine();
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
