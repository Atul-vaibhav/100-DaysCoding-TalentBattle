/* Day 33 coding Statement : Write a Program to check if String is a palindrome or not

Description

Get an input string from the user and then check whether it is a palindrome string or not.

Input

noon

Output

Palindrome

Input

Talent

Output

Not a Palindrome   */

import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int start = 0;
        int end = str.length() -1;
        boolean ispal = true;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                ispal = false;
                break;
            }
            start++;
            end--;
        }
        if(ispal == true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
