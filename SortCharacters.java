import java.util.Arrays;
import java.util.Scanner;
//Sort Characters in a String
public class SortCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        int[] arr=new int[str.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(str.charAt(i));
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print((char)(arr[i]));
        }
        sc.close();
    }
}
