package Sliding_Window;

public class Number_Substring_Containing_Three_Char {
    public  static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static int numberOfSubstrings(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int freq[] = { -1, -1, -1 };
        int count = 0;
        for (int i = 0; i < n; i++) {
            int p = arr[i] - 'a';
            freq[p] = i;
            if (freq[0] != -1 && freq[1] != -1 && freq[2] != -1) {
                int m = min(freq[0], freq[1], freq[2]);
                count += 1 + m;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }
}
