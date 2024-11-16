/* Day 32 coding Statement : Write a Program to Remove vowels from a string

Description

Get a string as the input from the user and then remove all the vowel letters from the string and give the output.

Input

remove

Output

rmv   */


import java.util.Scanner;
public class Day32 {
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = removevowel(str);
        System.out.println(result);
    }
    public static String removevowel(String S){
        StringBuilder sb = new StringBuilder();

        for(char c : S.toCharArray()){
            if(c != 'a' && c != 'e' && c!='i' && c != 'o' && c != 'u' && c != 'A'
             && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                sb.append(c);
             }
        }
        return sb.toString();
    }
}
