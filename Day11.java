/* Day 11 coding Statement:  Write a program to find Fibonacci series up to n

Description

Fibonacci series is a special series where nth term is the sum of previous two terms in the series. The series starts with 0 and 1 as the first and second term of the series respectively.

Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.

Input

5

Output

0,1,1,2,3

Input

8

Output

0,1,1,2,3,5,8,13   */
import java.util.Scanner;
public class Day11 {
    public static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.print(fibonacci(i) +" ");
        }
        sc.close(); 
    }
}
