/*Day 61 coding Statement : Chess Format 

Given the time control of a chess match as a+b, determine which format of chess out of the given 4 it belongs to.

1) Bullet if a+b<3

2) Blitz if 3≤a+b≤10

3) Rapid if 11≤a+b≤60

4) Classical if 60<a+b

Input Format

First line will contain T, number of testcases. Then the testcases follow.

Each testcase contains a single line of input, two integers a,b

Output Format

For each testcase, output in a single line, answer 1 for bullet, 2 for blitz, 3 for rapid, and 4 for classical format.

Sample Input 1

4

1 0

4 1

100 0

20 5

Sample Output 1

1

2

4

3 */
import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println();
        int t = sc.nextInt();

        for(int i=1;i<=t;i++){
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a+b<3){
            System.out.println("1");
        }else if(a+b>=3 && a+b<=10){
            System.out.println("2");
        }else if(a+b>=11&&a+b<=60){
            System.out.println("3");
        }else if(a+b<60){
            System.out.println("4");
        }
    }
}}
