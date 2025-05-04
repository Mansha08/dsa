package Sliding_Window;

public class Mininum_Window_Substring {
    public static String minWindow(String s, String t) {
        int[] map = new int[128];
        int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
        for (char c : t.toCharArray()) {
            map[c]++;  }
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map[c] > 0) {//denotes that character is required character
                counter--;//found a required character
            }
            map[c]--;
            end++;
            while (counter == 0) {
                if (minLen > end - start) {
                    minLen = end - start;
                    minStart = start;  }
                char c2 = s.charAt(start);
                map[c2]++;
                if (map[c2] > 0) {
                    counter++;   }
                start++;
            }   }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);

    }

    public static void main(String[] args) {
        String s= "ADOBECODEBANC";
        String t = "ABC"; 

        System.out.println(minWindow(s, t));
    }
}
