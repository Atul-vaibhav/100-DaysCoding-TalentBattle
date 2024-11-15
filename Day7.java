/*  Write a program to find Number of days in a given month of a given year

Description

Get the number of month and year as input from the user and check the number of days present in that month.

Input

Enter month : 2

Enter year : 2000

Output

29  */
import java.util.Scanner;
public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        if(year%100==0){
            if(year%4==0){
                if(month==2){
                    System.out.println("29");
                }else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                    System.out.println("31");
                }else{
                    System.out.println("30");
                }
            }
        }else{
            if(year%4==0){
                if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
                    System.out.println("31");
                }else if(month==2){
                    System.out.println("28");
                }else{
                    System.out.println("30");
                }
            }
        }
        sc.close();
    }
}