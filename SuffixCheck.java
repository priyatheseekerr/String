import java.util.Scanner;
//	Check if a String Ends with a Given Suffix
public class SuffixCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the suffix string to check: ");
        String suffix = sc.nextLine();
        if (suffix.equals(str.substring(str.length() - suffix.length())))
            System.out.println(true);
        else
            System.out.println(false);
        sc.close();
    }
}
