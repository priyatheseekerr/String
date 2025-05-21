import java.util.Scanner;
//Remove Leading and Trailing Spaces
public class RemoveLeadingAndTrailing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String word = sc.nextLine();
        String result = word.trim();
        System.out.println("String before removal of sapce: " + word);
        System.out.println("String after removal space: " + result);
        sc.close();
    }
}
