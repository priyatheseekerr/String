//Reverse words in a string
import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String: ");
        String word=sc.nextLine();
        
        String[] str=word.split(" ");
         for(int i=0;i<str.length;i++){
            StringBuilder wrd=new StringBuilder(str[i]);
            wrd.reverse();
            str[i]=wrd.toString();
         }
         System.out.println(String.join(" ", str));
         sc.close();
    }
}
