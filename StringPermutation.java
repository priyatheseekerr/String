import java.util.Scanner;
//	Generate All Permutations of a String
public class StringPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String word = sc.nextLine();
        permu(" ", word);
        sc.close();
    }

    static void permu(String perfix, String word) {
        int n = word.length();
        if (n == 0) {
            System.out.println(perfix);
        } else {
            for (int i = 0; i < n; i++) {
                permu(perfix + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
            }
        }

    }
}
