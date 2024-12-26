import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int T = sc.nextInt();

        for(int t= 0; t<T;t++){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int P = sc.nextInt();

            int totalmarks = X*3-(N-X);

            if(totalmarks >= P){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
            }
        }
        sc.close();
    }
}
