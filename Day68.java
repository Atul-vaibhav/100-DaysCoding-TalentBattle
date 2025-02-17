/* Day 68 coding Statement : you will be given queries. Each query is of one of the following three types: :

Add an element to the set. :

Delete an element from the set. (If the number is not present in the set, then do nothing). :

If the number is present in the set, then print "Yes"(without quotes) else print "No"(without quotes).

Input Format

The first line of the input contains where is the number of queries. The next lines contain query each. Each query consists of two integers and where is the type of the query and is an integer.

Constraints

 

Output Format

For queries of type print "Yes"(without quotes) if the number is present in the set and if the number is not present, then print "No"(without quotes).

Each query of type should be printed in a new line.

Sample Input

8

1 9

1 6

1 10

1 4

3 6

3 14

2 6

3 6

Sample Output

Yes

No

No */
import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX_VAL = 100000;
        int[] arr = new int[MAX_VAL+1];

        int Q = sc.nextInt();

        for(int i=0;i<Q;i++){
            int querytype= sc.nextInt();
            int x = sc.nextInt();

            if(querytype==1){
                arr[x]=1;
            }
            else if(querytype==2){
                arr[x]=0;
            }
            else if(querytype==3){
                if(arr[x]==1){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }
}
