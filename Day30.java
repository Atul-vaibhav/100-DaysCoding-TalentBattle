/* Write a Program to print Length of the string without using strlen() function

Description

Get a string as input from user and print the length of the string without using strlen() function.

Input

Hello

Output

5  */
import java.util.Scanner;
public class Day30 {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length =0;
        for(char c: str.toCharArray()){
            length++;
        }
        System.out.println(length);
    }
}
