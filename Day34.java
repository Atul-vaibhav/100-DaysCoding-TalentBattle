/*  Day 34 coding Statement : Write a Program to Remove brackets from an algebraic expression

Description

Get an algebraic expression as input from the user and then remove all the brackets in that.

Input

7x+(2*y)

Output

7x+2*y  */

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        System.out.println("Enter the Expression: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb= new StringBuilder();
        for(char c : str.toCharArray()){
            if(c != '(' && c != ')' && c != '{' && c!= '}' && c != '[' && c != ']'){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
