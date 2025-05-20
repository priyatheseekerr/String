import java.util.Scanner;
//	Check if String Contains Only Digits
public class OnlyDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word:");
        String word=sc.nextLine();
        boolean flag =true;
        for(int i=0;i<word.length();i++){
            if(!Character.isDigit(word.charAt(i))){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        sc.close();
    }
}
