/* Day 12 coding Statement:  Write a program to find Sum of digits of a number

Description

Get a number from user and then find the sum of the digits in the given number.

E.g. let the number = 341

Sum of digits is 3+4+1= 8

Input

4521

Output

12   */
import java.util.Scanner;
public class Day12 {
    public static int sum(int n){
        if(n<=9)
        return n;
        else
        return sum(n/10)+n%10;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter The Number: ");
       int num = sc.nextInt();
       int sum1 = sum(num);
       System.out.println(sum1);
       sc.close();
    }
}
