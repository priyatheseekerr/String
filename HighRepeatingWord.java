import java.util.Scanner;
//Write a program to find a word in a given string which has the highest number of repeated letters
public class HighRepeatingWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the word: ");
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        String word=" ";
        int max=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr[i].length();j++){
               char ch=arr[i].charAt(j);
               if(arr[i].indexOf(ch)!=arr[i].lastIndexOf(ch)){
                count++;
               }
            }
            if(count>max){
                max=count;
                word=arr[i];
            }
        }
        System.out.println(word);
        sc.close();
    }
}
