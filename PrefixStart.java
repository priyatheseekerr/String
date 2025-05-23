import java.util.Scanner;
//	Check if a String Starts with a Given Prefix
public class PrefixStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the prefix string to check: ");
        String prefix = sc.nextLine();
        if (prefix.equals(str.substring(0, prefix.length())))
            System.out.println(true);
        else
            System.out.println(false);
        sc.close();
    }
}
