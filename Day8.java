import java.util.Scanner;
public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a b c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long determinant = ((b*b)-4*a*c);
        if(determinant>0){
            System.out.println("Roots are real and distinct.");
        }else if(determinant==0){
            System.out.println("Roots are real and equal.");
        }else{
            System.out.println("Roots are imaginary.");
        }
        double root1 = (((-b + Math.sqrt(determinant))/2*a));
        double root2 = (((-b - Math.sqrt(determinant))/2*a));
        if(determinant==0){
            System.out.println("Root1 = Root2 = "+root1);
        }else
        System.out.println("Roots of the quadratic equation are "+root1+" "+root2);
        sc.close();
    }
}
