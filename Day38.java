/* Day 38 coding Statement : Write a Program to print Non-repeating characters in a string

Description

Get a string as the input from the user and print the non-repeating characters in a string.

Input

Hello

Output

H e o

*/

import java.util.Scanner;
public class Day38 {
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        nonrepeat(str);
    }

    public static void nonrepeat(String str){
        int[] freq = new int[256];

        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            freq[c]++;
        }

        System.out.print("Non-repeating characters: ");
        for(int i=0; i<str.length(); i++){
        char c= str.charAt(i);
        if (freq[c] == 1) {
            System.out.print(c + " ");
        }
    }
    }
}
