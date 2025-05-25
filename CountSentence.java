import java.util.Scanner;
//	Count the Number of Sentences
public class CountSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '!' || ch == ',' || ch == '?') {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
