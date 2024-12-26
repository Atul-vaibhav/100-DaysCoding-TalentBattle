import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int T= sc.nextInt();
        for(int i=1;i<=T;i++){
            System.out.print("Enter Backet Capacity and current water level: ");
            int k = sc.nextInt();
            int x = sc.nextInt();

            int extra = k-x;
            System.out.println("Minimum water that can be added: "+extra);
        }
        sc.close();
    }
}
