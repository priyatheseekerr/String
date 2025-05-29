import java.util.Scanner;
//	Convert Hexadecimal to String
public class HexaToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String hex = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < hex.length(); i += 2) {
            String str = hex.substring(i, i + 2);
            int n = Integer.parseInt(str, 16);
            res.append((char) (n));
        }
        System.out.println(res);
        sc.close();
    }
}
