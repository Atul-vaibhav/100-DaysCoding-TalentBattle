/* Write a Program to reverse a string.

Description

Get an input string from user and print it in reverse order.

Input

Hello

Output

olleH   */
import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        int n = str.length()-1;
        while(n>=0){
            rev = rev+str.charAt(n);
            n--;
        }
        System.out.println(rev);
    }
}
