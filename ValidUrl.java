import java.net.URL;
import java.util.Scanner;
//Check if a String is a Valid URL
public class ValidUrl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        try {
            new URL(str);
            System.out.println(true);
        } catch (Exception e) {
            System.out.println(false);
        }
        sc.close();
    }
}
