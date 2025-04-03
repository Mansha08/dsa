public class Beauty_sum {
    public static int beautySum(String s) {
        int totalBeauty = 0;
        for(int i = 0; i < s.length(); i++){
           int[] freq = new int[26];
           for(int j = i; j < s.length(); j++){
               int maxFreq = 0, minFreq = Integer.MAX_VALUE;
               freq[s.charAt(j) - 'a']++;
               for(int cnt: freq){
                    if(cnt > 0){
                       maxFreq = Math.max(maxFreq, cnt);
                       minFreq = Math.min(minFreq, cnt);
                    }
               }
               totalBeauty += (maxFreq - minFreq);
           }
        }
        return totalBeauty;
    }

public static void main(String[] args){
    String s = "aabac";
    System.out.println(beautySum(s));
}
}
