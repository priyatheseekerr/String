//Capitalize first and last character of each word


import java.util.*;

public class Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  a word: ");
        String word = sc.nextLine();

        String[] str = word.split(" ");      //converting String into String Array

        for (int i = 0; i < str.length; i++) {
            String wrd = str[i];        

            char first = Character.toUpperCase(wrd.charAt(0));          //converting first letter to uppercase

            char last = Character.toUpperCase(wrd.charAt(wrd.length() - 1));   //converting last letter to uppercase

            String middle = wrd.substring(1, wrd.length() - 1);     //extarcting middle element from string

            str[i] = first + middle + last;           
        }

        for (String s : str) {
            System.out.print(s + " ");
        }
        sc.close();
    }
}