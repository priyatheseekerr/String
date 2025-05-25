import java.util.Scanner;
//	Remove Consecutive Duplicates
public class CaseinsenstivieEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string 1: ");
        String str1 = sc.next();
         System.out.println("enter the string 2: ");
        String str2 = sc.next();
        System.out.println( str1.equalsIgnoreCase(str2));
        sc.close();


    }
}
