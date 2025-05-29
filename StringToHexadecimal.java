import java.util.Scanner;
//	Convert a String to Hexadecimal
public class StringToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for (char ch : str.toCharArray()) {
            res.append(Integer.toHexString(ch));
        }
        System.out.println(res);
        sc.close();
    }
}
