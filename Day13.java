import java.util.Scanner;
public class Day13 {
    public static int Naturalsum(int n){
        if(n==1)
        return 1;
        else
        return Naturalsum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the value of n");
        int num = sc.nextInt();
        int sum = Naturalsum(num);
        System.out.println(sum);
        sc.close();
    }
}
