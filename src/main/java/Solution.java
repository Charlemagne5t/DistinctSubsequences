
public class Solution {
    public int numDistinct(String s, String t) {
        int m = t.length();
        int n = s.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (t.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        return dp[m][n];
    }

    


    private void matrixPrinter(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t ");
            }
            System.out.println();
        }
    }
    private void matrixPrinter(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t ");
            }
            System.out.println();
        }
    }
}
