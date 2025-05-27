import java.util.HashMap;
import java.util.Scanner;
//	Capitalize Every Other Word
public class DictionaryCharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        map.forEach((key, value) -> System.out.println(key + " : " + value));
        sc.close();
    }
}
