/* Day 36 coding Statement : Write a Program to Capitalize the first and last letter of each word of a string

Description

Get a string from the user and then change the first and last letter to uppercase.

Input

programming

Output

ProgramminG   */


import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words){
            if(word.length() == 1){
                result.append(Character.toUpperCase(word.charAt(0))).append(" ");
            }else{
                char first = Character.toUpperCase(word.charAt(0));
                char last= Character.toUpperCase(word.charAt(word.length() -1 ));
                String middle = word.substring(1,word.length()-1);
                result.append(first).append(middle).append(last).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
