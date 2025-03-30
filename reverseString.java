//Reverse a String
import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string: ");
        String word = sc.nextLine();
        StringBuilder reversedString = new StringBuilder(word);
        System.out.println(reversedString.reverse());
        sc.close();
    }

}
