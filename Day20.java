import java.util.Scanner;
public class Day20 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==1)
        System.out.println(num + " is not a prime number.");
        if(num==2||num==3)
        System.out.println(num + " is a prime number.");
        if(num%2==0||num%3==0)
        System.out.println(num + " is not a prime number.");
        for(int i=5;i<=num;i=i+6){
            if(num%i==0||num%(i+2)==0){
                System.out.println(num + " is not a prime number.");
            }
        }
        sc.close();
    }
}
