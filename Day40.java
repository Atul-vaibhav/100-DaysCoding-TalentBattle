/* Day 40 coding Statement : Write a Program to Replace substring in a string
Description

Get a string as input from the user and then get another string which has to be removed from the string.

Get the third input, the new substring which is placed in that substring position.

Finally print the output by replacing the substring with new string.

Input
Enter a string
talentbattle

Enter the substring to be removed :
talent

Enter the new substring :
student

Output
The new string :

studentbattle   */

import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the main String: ");
        String str = sc.nextLine();
        System.out.print("Enter the string to be removed: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the new String to be inserted: ");
        String str2 = sc.nextLine();
        String result = str.replace(str1, str2);
        System.out.print("The New String: "+result);
        sc.close();
    }
}
