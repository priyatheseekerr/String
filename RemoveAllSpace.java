import java.util.Scanner;
//Remove All Spaces Except Single Spaces
public class RemoveAllSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        str = str.trim().replaceAll("\\s+", " ");
        System.out.println(str);
        sc.close();
    }
}
