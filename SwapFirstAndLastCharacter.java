import java.util.Scanner;
//	Swap First and Last Characters
public class SwapFirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String result = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        System.out.println(result);
        sc.close();
    }
}
