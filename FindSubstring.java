import java.util.Scanner;
//	Write a program to find a substring within a string. If found display its starting position
public class FindSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        int index = word1.indexOf(word2);
        if (index != -1) {
            System.out.println("Word 2 found in the index of: " + index);
        } else {
            System.out.println("index is not found");
        }
        sc.close();
    }
}
