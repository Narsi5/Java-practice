import java.util.Scanner;

public class Main {

    public static void kohli(int m, int n, int[][] runs) {
        int maxScore = Integer.MIN_VALUE;
        int maxPlayer = -1;
        int maxMatchIndex = -1;

        for (int i = 0; i < m; i++) {
            int[] dp = new int[n];

            dp[0] = runs[i][0];
            if (n > 1) {
                dp[1] = Math.max(runs[i][0], runs[i][1]);
            }

            for (int j = 2; j < n; j++) {
                dp[j] = Math.max(dp[j - 1], dp[j - 2] + runs[i][j]);
            }

            if (dp[n - 1] > maxScore) {
                maxScore = dp[n - 1];
                maxPlayer = i;
                maxMatchIndex = (n > 1 && runs[i][0] >= runs[i][1]) ? 0 : 1;
            }
        }

        System.out.println(maxScore );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt(); // Number of players


        int n = scanner.nextInt(); // Number of matches

        int[][] runs = new int[m][n]; // Array to store runs scored by each player in each match

        // Input runs for each player in each match
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                runs[i][j] = scanner.nextInt();
            }
        }

        kohli(m, n, runs);

        scanner.close();
    }
}
