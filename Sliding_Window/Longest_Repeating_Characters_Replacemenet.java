package Sliding_Window;

public class Longest_Repeating_Characters_Replacemenet {
    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxlen = 0;
        int maxfreq = 0;
        int start = 0;
        for(int end = 0;end <s.length();end++){

            char ch = s.charAt(end);
            freq[ch - 'A']++;
            maxfreq = Math.max(maxfreq, freq[ch - 'A']);
            while((end - start +1) - maxfreq > k){
                freq[s.charAt(start) - 'A']--;
                start++;
            }
            maxlen = Math.max(maxlen, end - start +1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
        
    }
    
}
