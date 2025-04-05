import java.util.Scanner;

//Find non-repeating characters of a String
public class NonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String word = sc.nextLine().toLowerCase();

        boolean[] flag = new boolean[word.length()];
        int count;

        System.out.println("Non repeating characters");
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (flag[i]) {
                continue;
            }
            count = 1;
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(j) == ch) {
                    flag[j] = true;
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(ch + " ");
            }
        }
        sc.close();
    }
}
