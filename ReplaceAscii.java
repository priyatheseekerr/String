import java.util.Scanner;
//	Replace Each Character with its ASCII Value
public class ReplaceAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("String before replace: " + str);
        for (char ch : str.toCharArray()) {
            System.out.print((int) ch+" ");
        }
        sc.close();
    }
}
