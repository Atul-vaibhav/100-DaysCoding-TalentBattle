/* Day 21 coding Statement : Write a program to identify if the number is Palindrome or not

Description

Get a number as input from the user and check whether that number is a Palindrome or not.

Input

121

Output

Palindrome

Input

34

Output

Not a Palindrome  */
import java.util.Scanner;
public class Day21 {
    public static boolean ispal(int number, int reversed){
        if(number==0){
        return reversed==original;
    }
        reversed = reversed * 10 + number % 10;
        return ispal(number / 10, reversed);
    }
    static int original;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        original = sc.nextInt();
        if(ispal(original,0)){
            System.out.println(original +" is a palindrome");
        }else{
            System.out.println(original+" is not a palindrome");
        }
        sc.close();
    }
}
