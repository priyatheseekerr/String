import java.util.Scanner;
//	Check if two strings match where one string contains wildcard characters
public class WildCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string: ");
        String word=sc.next();
        System.out.println("Enter the pattern:");
        String  pattern=sc.next();
        char start=' ';
        char end=' ';
        for(int i=0;i<pattern.length();i++){
            if(pattern.charAt(i)=='?');
            start=pattern.charAt(i-1);
            end=pattern.charAt(i+1);
        }
        boolean flag=false;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==start && word.charAt(i+2)==end){
                flag =true;
            }
        }
        if(flag==true){
            System.out.println("It is wildcraft");
        }
        else{
            System.out.println("It is not wild ");
        }
        sc.close();
    }
}
