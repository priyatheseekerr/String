//Remove brackets from an algebraic expression
import java.util.Scanner;

public class removebracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string: ");
        String word = sc.nextLine();

        StringBuilder result= new StringBuilder();
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch=='('||ch==')'){
                continue;
            }
            result.append(ch);
        }
        System.out.println(result);
        sc.close();
    }
}
