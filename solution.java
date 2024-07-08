import java.util.*;
public class solution {


    public static int count(int N, int[] A, int K, int budget) {
        int count = 0;

        for (int i = 0; i <= N - K; i++) {
            int sum = 0;
            for (int j = i; j < i + K; j++) {
                sum += A[j];
            }

            if (sum <= budget) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int K = scanner.nextInt();

        int budget = scanner.nextInt();
        scanner.close();

        int result = count(N, A, K, budget);
        System.out.println(result);
    }
    //knapsack
}