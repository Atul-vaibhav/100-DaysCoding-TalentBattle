import java.util.Scanner;

public class Day68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX_VAL = 100000;
        int[] arr = new int[MAX_VAL+1];

        int Q = sc.nextInt();

        for(int i=0;i<Q;i++){
            int querytype= sc.nextInt();
            int x = sc.nextInt();

            if(querytype==1){
                arr[x]=1;
            }
            else if(querytype==2){
                arr[x]=0;
            }
            else if(querytype==3){
                if(arr[x]==1){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
        sc.close();
    }
}
