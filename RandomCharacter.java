import java.util.Random;
import java.util.Scanner;
//	Generate a String of Random Characters
public class RandomCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the string: ");
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            Random ran = new Random();
            System.out.print((char) ('a' + ran.nextInt(26)));
        }
        sc.close();
    }
}
