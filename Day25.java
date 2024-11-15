/* Day 25 coding Statement : Write a program to find Area of a circle

Description

Get the value for radius from the user and calculate the area of the circle for the given radius.

Area of circle = 3.14*radius*radius

Input

3

Output

28.26  */
import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        System.out.print("Enter the radius: ");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        Double area =0.0;
        area = (Double) 3.14*radius*radius;
        System.out.println("Area = "+area);
    }
}
