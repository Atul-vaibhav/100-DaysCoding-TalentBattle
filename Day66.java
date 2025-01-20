/*Day 66 coding Statement : Palindromic substrings

Anoop likes strings a lot but he likes palindromic strings more. Today, Anoop has two strings A and B, each consisting of lower case alphabets.

Anoop is eager to know whether it is possible to choose some non empty strings s1 and s2 where s1 is a substring of A, s2 is a substring of B such that s1 + s2 is a palindromic string.

Here '+' denotes the concatenation between the strings.

Input

First line of input contains a single integer T denoting the number of test cases.

For each test case:

First line contains the string A

Second line contains the string B.

Output

For each test case, Print "Yes" (without quotes) if it possible to choose such strings s1 & s2. Print "No" (without quotes) otherwise.

Input

3

abc

abc

a

b

abba

baab

Output

Yes

No

Yes */
import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-->0){
            String A = sc.nextLine();
            String B= sc.nextLine();

            Boolean found = false;

            outerloop:
            for(int i=0;i<A.length();i++){
                char charA = A.charAt(i);
                for(int j= 0;j<B.length();j++){
                    if(charA == B.charAt(j)){
                        found = true;
                        break outerloop;
                    }
                } 
            }
            if(found){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
