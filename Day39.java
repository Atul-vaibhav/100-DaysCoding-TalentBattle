/* Day 39 coding Statement : Write a Program to check if two strings are Anagram or not

Description

Get two strings as input from the user and check whether it is Anagram or not.

Input

sunlight thgiluns

Output

Anagram  */

import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        System.out.println("Enter 1st string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter 2nd String: ");
        String str1 = sc.nextLine();

        if(isAnagram(str, str1)){
            System.out.println("The Strings are Anagram ");
        }else{
            System.out.println("The Strings are not Anagram");
        }
    }
    public static boolean isAnagram(String str, String str1){
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        if(str1.length() != str1.length()){
            return false;
        }
         int[] count = new int[256];
         for(int i=0; i<str.length();i++){
            count[str.charAt(i)]++;
            count[str1.charAt(i)]--;
         }
        for(int i=0; i<256;i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}
