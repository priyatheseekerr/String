import java.util.Scanner;
//Get the Length of Each Word in a String
public class LengthOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = sc.nextLine();
        String[] arr = word.split(" ");
        for (String s : arr) {
            System.out.print(s.length() + " ");
        }
        sc.close();
    }
}
