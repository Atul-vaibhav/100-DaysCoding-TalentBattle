/* Day 16 coding Statement : Write a program to identify if the number is Perfect number or not

Description

Get the input from the user and check whether that number is a perfect number or not.

E.g. Let number is 28, factors of 28 are 1,2,4,7,14. Now the sum of all these factors are 28 itself.

Input

28

Output

Perfect Number

Input

4

Output

Not a perfect number   */
import java.util.Scanner;
public class Day16 {
    public static boolean isPerfect(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        if (isPerfect(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }   
        sc.close();
    }
}