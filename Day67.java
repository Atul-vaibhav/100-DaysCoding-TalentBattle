import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        while (T-- > 0) {
            int S = sc.nextInt(); 
            int W1 = sc.nextInt();
            int W2 = sc.nextInt();
            int W3 = sc.nextInt();

            
            int normalHits = calculateHits(S, W1, W2, W3);
            int reversedHits = calculateHits(S, W3, W2, W1);

            
            System.out.println(Math.min(normalHits, reversedHits));
        }
        sc.close();
    }

    
    private static int calculateHits(int S, int a, int b, int c) {
        int hits = 0;
        int sum = 0;

        // First brick
        if (sum + a <= S) {
            sum += a;
        } else {
            hits++;
            sum = a;
        }

        // Second brick
        if (sum + b <= S) {
            sum += b;
        } else {
            hits++;
            sum = b;
        }

        // Third brick
        if (sum + c <= S) {
            sum += c;
        } else {
            hits++;
            sum = c;
        }

        // Count the last hit if sum > 0
        if (sum > 0) {
            hits++;
        }

        return hits;
    }
}
