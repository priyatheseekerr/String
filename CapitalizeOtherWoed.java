import java.util.Scanner;
//		Capitalize Every Other Word
public class CapitalizeOtherWoed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = sc.nextLine();
        String[] arr = word.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result.append(arr[i]+" ");
            } else {
                String s = arr[i];
                s = Character.toUpperCase(s.charAt(0)) +( s.substring(1)+" ");
                result.append(s);
            }
        }
        System.out.println(result);
        sc.close();

    }
}
