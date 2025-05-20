import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
//Split a String by Delimiter
public class SplitByDelimiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = sc.nextLine();
        System.out.println("Enter the delimiter:");
        String delimiter = sc.next();
        String[] arr = word.split(Pattern.quote(delimiter));
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
