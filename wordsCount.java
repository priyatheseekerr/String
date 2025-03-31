import java.util.Scanner;

public class wordsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String word = sc.nextLine();

        String[] str = word.split(" ");
        System.out.println("Words in the String: " + str.length);
        sc.close();
    }
}
