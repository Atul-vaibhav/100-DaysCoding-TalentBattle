/* Write a program to identify of the a number is positive or negative

Description

Get an input number from the user and check whether it is a positive or negative number.

Input :

-10

Output : 

Negative number

Input :

0

Output :

Neither positive nor negative

Input :

15

Output : 

Positive number  */
import java.util.Scanner;
public class Day4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num>0)
        System.out.println(num+ " is a positive Number ");
        else if(num==0)
        System.err.println("Neither Psotive Nor Negative");
        else
        System.out.println(num+" is a negative number ");
    }
}
