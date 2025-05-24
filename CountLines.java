import java.util.Scanner;
//	Count the Number of Lines in a String
public class CountLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter multiple lines of text(Type 'End' to finish): ");
        int count = 0;
        while (true) {
            String str = sc.nextLine();
            if (str.equals("End")) {
                break;
            }
            count++;
        }
        System.out.println("Number of lines in the text is : " + count);
        sc.close();
    }
}
