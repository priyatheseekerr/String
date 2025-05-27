import java.util.Scanner;
//	Generate a String from a List of Words
public class ListToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the length of the string: ");
        int len = sc.nextInt();
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.next();  
        }
        for(int i=0;i<len;i++){
             System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
