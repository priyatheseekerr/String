import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//	Count the Number of Occurrences of a Word
public class OccurenceOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        Map<String, Integer> mp = new HashMap<>();
        String[] arr = str.split(" ");
        for (String s : arr) {
                mp.put(s, mp.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        sc.close();
    }
}
