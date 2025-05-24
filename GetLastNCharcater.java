import java.util.Scanner;
//	Get the Last N Characters of a String
public class GetLastNCharcater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Enter the n th Character: ");
        int n = sc.nextInt();
        System.out.println(str.substring(n));
        sc.close();
    }
}
