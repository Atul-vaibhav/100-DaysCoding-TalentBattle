/*Day 65 coding Statement : New Tablet

Ajinkya decided to buy a new tablet. His budget is B, so he cannot buy a tablet whose price is greater than B. Other than that, he only has one criterion — the area of the tablet's screen should be as large as possible. Of course, the screen of a tablet is always a rectangle.

Ajinkya has visited some tablet shops and listed all of his options. In total, there are N available tablets, numbered 1 through N. For each valid i, the i-th tablet has width Wi, height Hi and price Pi.

Help Ajinkya choose a tablet which he should buy and find the area of such a tablet's screen, or determine that he cannot buy any tablet.

Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.

The first line of each test case contains two space-separated integers N and B. N lines follow.

For each i (1≤i≤N), the i-th of these lines contains three space-separated integers Wi, Hi and Pi.

Output

For each test case, print a single line. If Ajinkya cannot buy any tablet, it should contain the string "no tablet" (without quotes).

Otherwise, it should contain a single integer — the maximum area of the screen of a tablet Ajinkya can buy.

Sample Input 1

3

3 6

3 4 4

5 5 7

5 2 5

2 6

3 6 8

5 4 9

1 10

5 5 10

Sample Output 1

12

no tablet

25 */
import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0){
            int N = sc.nextInt();
            int B = sc.nextInt();

            int maxArea = -1;

            for(int  i=0; i<N;i++){
                int w = sc.nextInt();
                int H = sc.nextInt();
                int P = sc.nextInt();

                if(P<=B){
                    int area = w*H;
                    if (area>maxArea){
                        maxArea = area;
                    }
                }
            }
            if(maxArea == -1){
                System.out.println("No Tablet");
            }else{
                System.out.println(maxArea);
            }
        }
        sc.close();
    }
}
