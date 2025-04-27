import java.util.Scanner;
//	Concatenate one string to another
public class StringConcatenate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the two string to concatenate: ");
        String word1=sc.nextLine();
        String word2=sc.nextLine();

        System.out.println(word1+word2);
        sc.close();
    }
}
