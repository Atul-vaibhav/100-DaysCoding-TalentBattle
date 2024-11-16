/* Day 35 coding Statement : Write a Program to Count the sum of numbers in a string

Description

Get a string from the user and find the sum of numbers in the string.

Input

Hello56

Output

11 */

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        int sum=0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                sum += c-'0'; 
            }
        }
        System.out.println("Sum of digits is " +sum);
    }
}
