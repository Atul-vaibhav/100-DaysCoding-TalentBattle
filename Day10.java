/* Day 10 coding Statement:  Write a program to find Factorial of a number

Description

Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output.

Input

4

Output

24  */
import java.util.Scanner;
public class Day10 {
    public static int fact(int num){
        if(num==0)
        return 1;
        else{
            return num*fact(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n= sc.nextInt();
        int factorial = fact(n);
        System.out.println(factorial);
        sc.close();
    }
}
