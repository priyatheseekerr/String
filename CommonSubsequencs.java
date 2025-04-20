import java.util.Scanner;
//Count common sub-sequence in two strings
public class CommonSubsequencs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        String word1 = sc.nextLine();
        int result = subsequence(word, word1);
        System.out.println(result);
        sc.close();
    }

    public static int subsequence(String word, String word1) {
        int m = word.length();
        int n = word1.length();

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (word.charAt(i - 1) == word1.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
                }
            }
        }
        return dp[m][n];
    }
}
