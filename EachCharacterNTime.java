import java.util.Scanner;
//	Repeat Each Character N Times
public class EachCharacterNTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        System.out.println("Enter how many times to repeat: ");
        int n = sc.nextInt();
        for (char ch : str.toCharArray()) {
            for (int i = 0; i < n; i++) {
                System.out.print(ch);
            }
        }
        sc.close();
    }
}
