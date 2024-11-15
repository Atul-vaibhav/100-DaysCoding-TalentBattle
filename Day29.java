/* Write a Program to concatenate a string.

Description

Get two strings as input from the user and then concatenate it.

Input

Enter first string

Hello

Enter second string

Hi

Output

HelloHi  */
import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        System.out.print("Enter first String: ");
        Scanner sc =new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();
        System.out.println(str1+str2);
    }
}
