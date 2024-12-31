import java.util.*;

public class Day62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Naive approach
        System.out.println("Naive Approach:");
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            int totalCapacity = 0;
            
            for (int i = 0; i < N + 1; i++) {
                totalCapacity += Y;
            }

            if (totalCapacity >= X) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
