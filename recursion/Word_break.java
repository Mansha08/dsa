package recursion;
import java.util.*;


public class Word_break {
     public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        int n = s.length();
        
        // dp[i] means s[0...i-1] can be segmented
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // base case, empty string can be segmented
        
        // Check each position in the string
        for (int i = 1; i <= n; i++) {
            // Try to find a valid word ending at position i
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        // The result is stored in dp[n]
        return dp[n];
    }

    public static void main(String[] args) {
        Word_break solution = new Word_break();

        // Test case 1
        String s1 = "leetcode";
        List<String> wordDict1 = Arrays.asList("leet", "code");
        System.out.println(solution.wordBreak(s1, wordDict1)); // Expected output: true

        // Test case 2
        String s2 = "applepenapple";
        List<String> wordDict2 = Arrays.asList("apple", "pen");
        System.out.println(solution.wordBreak(s2, wordDict2)); // Expected output: true

        // Test case 3
        String s3 = "catsandog";
        List<String> wordDict3 = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println(solution.wordBreak(s3, wordDict3)); // Expected output: false
    }
    
}
