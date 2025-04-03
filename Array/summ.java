import java.util.Scanner;

public class summ {
   
        public static void main(String[] args) {
            String X = "geeks";
            String Y = "grand";
            int k = 2;
    
            int minCost = minCostLCS(X, Y, k);
            if (minCost == Integer.MAX_VALUE) {
                System.out.println("It is not possible to get LCS of length " + k);
            } else {
                System.out.println("The minimum cost to get LCS of length " + k + " is: " + minCost);
            }
        }
    
        // Function to calculate character value ('a' -> 0, 'b' -> 1, ..., 'z' -> 25)
        public static int charValue(char c) {
            return c - 'a';
        }
    
        // Function to find the minimum cost to convert X such that the LCS of X and Y is of length k
        public static int minCostLCS(String X, String Y, int k) {
            int m = X.length();
            int n = Y.length();
            
            // dp[i][j][len] will store the minimum cost to get an LCS of length 'len'
            // using the first 'i' characters of X and the first 'j' characters of Y.
            int[][][] dp = new int[m + 1][n + 1][k + 1];
    
            // Initialize dp with a large value
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    for (int len = 0; len <= k; len++) {
                        dp[i][j][len] = Integer.MAX_VALUE;
                    }
                }
            }
    
            // Base case: no cost if LCS length is 0
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    dp[i][j][0] = 0;
                }
            }
    
            // Fill dp table
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    for (int len = 1; len <= k; len++) {
                        // Option 1: Don't include X[i-1] and Y[j-1] in LCS, take the previous best
                        dp[i][j][len] = Math.min(dp[i][j][len], dp[i-1][j][len]);
                        dp[i][j][len] = Math.min(dp[i][j][len], dp[i][j-1][len]);
    
                        // Option 2: Include X[i-1] and Y[j-1] in LCS if they match or after conversion
                        if (dp[i-1][j-1][len-1] != Integer.MAX_VALUE) {
                            int cost = charValue(X.charAt(i-1)) ^ charValue(Y.charAt(j-1));
                            dp[i][j][len] = Math.min(dp[i][j][len], dp[i-1][j-1][len-1] + cost);
                        }
                    }
                }
            }
    
            // The answer is the minimum cost to get an LCS of length k
            return dp[m][n][k];
        }
    }
    