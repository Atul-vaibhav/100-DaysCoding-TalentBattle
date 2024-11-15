/* Day 31 coding Statement : Write a Program to Toggle each character in a string

Description

Get an input string from user and then convert the lower case of alphabets to upper case and all upper-case alphabets into lower case.

Input

Hello

Output

hELLO   */
import java.util.Scanner;

public class Day31 {
     public static String toggleCharacters(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            }

            else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } 

            else {
                result.append(ch);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String toggledString = toggleCharacters(input);
        System.out.println("Toggled String: " + toggledString);
    }
}
