import java.util.Scanner;
//	Repeat a String N Times
public class RepeatNTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String word = sc.next();
        System.out.println("Enter the number fo times to repeat:");
        int num = sc.nextInt();
        print(num, word);
        sc.close();
    }

    static void print(int n, String word) {
        if (n < 1) {
            return;
        }
        print(n - 1, word);
        System.out.println(word);
    }
}
