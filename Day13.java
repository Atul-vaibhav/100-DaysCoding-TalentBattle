/* Day 13 coding Statement:  Write a program to find Sum of N natural numbers

Description

Get the input from the user for the value of n and then find the sum of first n natural numbers.

e.g. let the n value = 5

then first 5 natural numbers are 1,2,3,4,5 for which we need to find the sum

Therefore sum of first 5 natural numbers is 1+2+3+4+5 = 15

Input

4

Output

10   */
import java.util.Scanner;
public class Day13 {
    public static int Naturalsum(int n){
        if(n==1)
        return 1;
        else
        return Naturalsum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the value of n");
        int num = sc.nextInt();
        int sum = Naturalsum(num);
        System.out.println(sum);
        sc.close();
    }
}
