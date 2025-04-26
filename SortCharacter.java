import java.util.*;

//	Write a program to sort characters in a string
public class SortCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String word = sc.nextLine();
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        String sortedCharcter = new String(arr);
        System.out.println(sortedCharcter);
        sc.close();
    }
}