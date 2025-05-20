import java.util.Scanner;
//	String Compression
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String word = sc.nextLine();
        StringBuilder CompressedWord = new StringBuilder();
        int count = 1;
        for (int i = 0; i < word.length(); i++) {
            if (i < word.length() - 1 && word.charAt(i) == word.charAt(i + 1)) {
                count++;
            } else {
                CompressedWord.append(word.charAt(i) + "" + count);
                count = 1;

            }
        }
        String result = CompressedWord.length() < word.length() ? CompressedWord.toString() : word;
        System.out.println(result);
        sc.close();
    }
}
