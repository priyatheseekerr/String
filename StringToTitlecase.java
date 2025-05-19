import java.util.Scanner;
//	Convert String to Title Case
public class StringToTitlecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = sc.nextLine();
        String[] arr = word.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            if (str.length() > 0) {
                str = Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
            }
            System.out.print(str + " ");
        }
        sc.close();
    }
}
