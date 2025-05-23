import java.util.Scanner;
//	Rotate a String
public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter k rotation:");
        int k = sc.nextInt();
        k = k % str.length();
        String rotated = str.substring(str.length() - k) + str.substring(0, str.length() - k);
        System.out.println(rotated);
        sc.close();
    }
}
