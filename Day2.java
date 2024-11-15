/* Write a program to identify if the character is an alphabet or not.

Description:

Take an input character from user and check whether it is an alphabet or not.

Input :

A

Output: 

Alphabet

Input:

7

Output:

Not an alphabet  */
import java.util.*;
public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if ((ch >='A' && ch<='Z')||(ch >= 'a' && ch<='z')){
            System.out.println(ch+ " is an alphabet ");
        }else{
            System.out.println("Invalid Input ");
        }
        sc.close();
    }
}
