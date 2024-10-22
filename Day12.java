import java.util.Scanner;
public class Day12 {
    public static int sum(int n){
        if(n<=9)
        return n;
        else
        return sum(n/10)+n%10;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter The Number: ");
       int num = sc.nextInt();
       int sum1 = sum(num);
       System.out.println(sum1);
       sc.close();
    }
}
