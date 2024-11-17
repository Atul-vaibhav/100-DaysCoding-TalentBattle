/* Day 37 coding Statement : Write a Program to calculate the Frequency of characters in a string

Description

Get a string as the input from the user and find the frequency of characters in the string.

Input

program

Output

The frequency of a is 1

The frequency of g is 1

The frequency of m is 1

The frequency of o is 1

The frequency of p is 1

The frequency of r is 2  */


import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[256];

        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            freq[c]++;
        }
        for(int i=0; i<256; i++){
            if(freq[i] > 0){
                System.out.println("Frequency of "+(char) i + " is : " + freq[i]);
            }
        }
    }
}
