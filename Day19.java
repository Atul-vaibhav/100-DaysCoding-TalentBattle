/* Day 19 coding Statement : Write a program to identify if the number is Armstrong number or not

Description

Get an input number from user and check whether the given number is an Armstrong number or not.

E.g. Let the number be 1634,

Here 1^4 + 6^4 + 3 ^4 + 4^4 = 1634

Therefore, this is an Armstrong number

Input

153

Output

Armstrong number

Input

121

Output

Not an Armstrong number  */
import java.util.Scanner;
public class Day19 {
    public static boolean isArmstrong(int n){
        int temp,digits =0,last=0,sum=0;
        temp = n;
        while(temp>0){
            temp = temp/10;
            digits++;
        }
        temp = n;
        while (temp>0) {
            last = temp%10;
            sum+=(Math.pow(last,digits));
            temp = temp/10;
        }
        if(n==sum)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int num = sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("Armstrong.");
        }
        else{
            System.out.println("Not Armstrong.");
        }
    }
}
