import java.util.Scanner;
//	Write a program to find the largest word in a given string
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        int max = 0;
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            if (word.length() > max) {
                max = word.length();
                result = arr[i];
            }

        }
        System.out.println(result);
        sc.close();
    }
}
