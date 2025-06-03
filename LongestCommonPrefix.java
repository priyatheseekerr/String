import java.util.Scanner;
//Find the Longest Common Prefix of a List of Strings
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len =sc.nextInt();
        String[] arr=new String[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.next();
        }
       System.out.println(pre(arr));
       sc.close();
    }
    static String pre(String[] arr){
        if(arr==null || arr.length==0){
            return " ";
        }
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++){
            while(!arr[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                return " ";
            }
        }
        return prefix;

    }
}
