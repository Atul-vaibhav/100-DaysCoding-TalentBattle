/* Day 41 coding Statement : Check if two strings match where one string contains wildcard characters

Description

Get two strings as input from the user, first with wildcard characters (* and ?) and second without wildcard characters.

Then check whether they match or not.

Input

Ta**nt

Talent

Output

Yes they match */

import java.util.Scanner;
public class Day41 {
public static boolean isMatch(String pattern, String text){
    int p= 0,t=0;
    int startIndex = -1,matchIndex = -1;

    while(t<text.length()){
        if(p < pattern.length() && (pattern.charAt(p) == text.charAt(t) || pattern.charAt(p) == '?')){
            p++;
            t++;
        }
        else if (p<pattern.length() && pattern.charAt(p) == '*') {
            startIndex = p;
            matchIndex = t;
            p++;
        }

        else if(startIndex != -1){
            p=startIndex + 1;
            t=matchIndex +1;
            matchIndex++;
        }
        else{
            return false;
        }
    }
    while (p< pattern.length() && pattern.charAt(p) == '*'){
        p++;
    }
    return p ==pattern.length();

}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the pattern (with wildcards):");
        String pattern = sc.nextLine();

        System.out.println("Enter the text: ");
        String text = sc.nextLine();

        if(isMatch(pattern, text)){
            System.out.println("Yes, They match");
        }else{
            System.out.println("No, The don't match");
        }
    }
}
