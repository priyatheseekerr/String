import java.util.Scanner;
//Remove characters from first string present in the second string
public class RemoveCharacterInFirstString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String word1 = sc.nextLine();

        System.out.println("Enter the string to remove: ");
        String word2 = sc.nextLine();

        char[] arr = word2.toCharArray();

        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (ch == arr[j]) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.print(ch);
            }
        }
        sc.close();
    }
}
