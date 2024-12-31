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
