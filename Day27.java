/* Write a program to find the double of the given number without using arithmetic operator

Description

For the given input number calculate the double of it without using arithmetic operator.

Input

4

Output

8 */

import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        result = num << 1;
        System.out.println(result);
    }
}
