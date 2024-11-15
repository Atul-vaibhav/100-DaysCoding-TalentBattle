/*  Write a program to identify if the number is even or odd

Description

Get a number as input from the user and check whether the given number is odd or even

Input

10

Output

Even

Input

5

Output

Odd  */
import java.util.Scanner;
public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+ " is Even number.");
        }else{
            System.out.println(num+ " is odd number.");
        }
        sc.close();
    }
}
