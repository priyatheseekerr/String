import java.util.Scanner;
//Remove Punctuation
public class RemovePunctuation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder word = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != '!') {
                word.append(ch);
            }
        }
        System.out.println(word);
        sc.close();
    }
}
