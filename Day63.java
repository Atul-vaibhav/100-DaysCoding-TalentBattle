import java.util.*;

public class Day63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            int w1 = scanner.nextInt();
            int w2 = scanner.nextInt();
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int M = scanner.nextInt();

            int minPossibleWeight = w1 + (x1 * M);
            int maxPossibleWeight = w1 + (x2 * M);

            if (w2 >= minPossibleWeight && w2 <= maxPossibleWeight) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        scanner.close();
    }
}