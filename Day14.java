/* Day 14 coding Statement : Write a program to reverse a given number

Description

Get an input from the user and the print the reverse of the given number as the output

E.g. let the number be 324 then the reverse of the number is 423

Input

675

Output

576  */
import java.util.Scanner;
public class Day14 {
    static int rev_num = 0; 
    static int base_pos = 1; 
    static int reverseDigits(int num) 
    { 
        if (num > 0) { 
            reverseDigits(num / 10); 
            rev_num += (num % 10) * base_pos; 
            base_pos *= 10; 
        } 
        return rev_num; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println(reverseDigits(num));
        sc.close(); 
    }
}
