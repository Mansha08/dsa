public class Sort_char_freq {
    public static String frequencySort(String s) {
        int n = s.length();
        char [] ch = s.toCharArray();
        int freq[] = new int[128];
        for(char c:ch)    freq[c]++;
        StringBuilder sb = new StringBuilder();
        while(true){
            int max =0;
            char chmax =0;
            for(int i=0;i<128;i++){
                if(freq[i]>max){
                    max = freq[i];
                    chmax = (char)(i);
                }  }
            sb.append(String.valueOf(chmax).repeat(max));
            freq[chmax]= 0;
            if(max == 0)   break;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));

    }
}
