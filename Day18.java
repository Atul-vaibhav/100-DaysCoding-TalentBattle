import java.util.Scanner;
public class Day18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter numerator for the first fraction (x1): ");
        int x1 = sc.nextInt();
        System.out.print("Enter denominator for the first fraction (y1): ");
        int y1 = sc.nextInt();

        System.out.print("Enter numerator for the second fraction (x2): ");
        int x2 = sc.nextInt();
        System.out.print("Enter denominator for the second fraction (y2): ");
        int y2 = sc.nextInt();

        int x3 = (x1*y2) + (x2*y1);
        int y3 = (y1*y2);

        int gcd = gcd(x3,y3);
        x3 /= gcd;
        y3 /= gcd;

        if(y3 == 1){
            System.out.println(x3+"/"+y3);
        }else{
            System.out.println(x3 + "/" + y3);
        }
        sc.close();
    }
    private static int gcd(int a, int b){
        while(b !=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
