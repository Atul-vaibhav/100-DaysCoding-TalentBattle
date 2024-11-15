/* Write a program to print Pyramid pattern using stars

Description

Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.

Input

4

Output

  *

 ***

*****

*******  */
import java.util.Scanner;
public class Day24 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
             while(j<=i){
                System.out.print("*");
                j++;
             }
             i++;
             System.out.println();
        }
    }
}
