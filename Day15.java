/* Day 15 coding Statement : Write a program to identify if the number is Strong number or not

Description

Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.

E.g. let the number be 145

Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.

Input

121

Output

Not a strong number

Input

2

Output

Strong number  */
import java.util.Scanner; 
import java.lang.Math;
public class Day15 {
 
static boolean isArmstrong(int n)   
{   
int temp, digits=0, last=0, sum=0;   

temp=n;   

while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   
{   
   
last = temp % 10;   
sum +=  (Math.pow(last, digits));   
temp = temp/10;   
}  
if(n==sum)   
return true;      
else return false;   
}   

public static void  main(String args[])     
{     
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the number: ");  
num=sc.nextInt();  
if(isArmstrong(num))  
{  
System.out.print("Strong Number");  
}  
else   
{  
System.out.print("Not a strong Number ");  
}  
}   
}  

