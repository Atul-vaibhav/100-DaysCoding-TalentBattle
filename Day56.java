import java.util.Scanner;

public class Day56 {
    
        public static int gcd(int a, int b){
            if(b==0){
                return a;
            }
            return gcd(b, a%b);
        }
        
    public static int lcm(int a, int b){
        return (a / gcd(a,b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int overallcm = arr[0];
        for(int i=1;i<n;i++){
            overallcm = lcm(overallcm,arr[i]);
        }

        boolean canbeequal = true;
        for(int i=0;i<n;i++){
            if(overallcm % arr[i] != 0){
                canbeequal = false;
                break;
            }
        }
        if(canbeequal){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
