import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Find the Most Common Word
public class CommonWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = sc.nextLine();
        String[] arr = word.toUpperCase().split(" ");
        HashMap<String, Integer> Count = new HashMap<>();
        for (String str : arr) {
            Count.put(str, Count.getOrDefault(str, 0) + 1);
        }
        String com = " ";
        int sum = 0;
        for (Map.Entry<String, Integer> entry : Count.entrySet()) {
            if (entry.getValue() > sum) {
                com = entry.getKey();
                sum = entry.getValue();

            }
        }
        System.out.println(com);
        sc.close();
    }
}
