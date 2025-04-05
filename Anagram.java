import java.util.Scanner;
//Check if two strings are anagram of each other
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a words: ");
        String word=sc.nextLine();
        String word1=sc.nextLine();
        boolean flag=true;

        if(word.length()==word1.length()){
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                if(!word1.contains(String.valueOf(ch))){
                    flag=false;
                    break;
                }
               
            }
            if(flag){
                System.out.println("The given word is anagram");
            }
            else{
                System.out.println("the given word is not anagram");
            }
        }
        else{
            System.out.println("the given word is not anagram");
        }
        sc.close();
    }
}
