import java.util.Scanner;
//	Convert a String to Uppercase
public class StringToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String word = sc.nextLine();
        String result = word.toUpperCase();
        System.out.println("String before conversion: " + word);
        System.out.println("String after conversion: " + result);
        sc.close();
    }
}
