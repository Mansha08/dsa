public class Reverse_String {
    public static String reverseWords(String s) {
        s = s.trim();
         
         // Step 2: Split the string by one or more spaces
         String[] words = s.split("\\s+");
         
         // Step 3: Reverse the list of words
         StringBuilder reversed = new StringBuilder();
         for (int i = words.length - 1; i >= 0; i--) {
             reversed.append(words[i]);
             if (i > 0) {
                 reversed.append(" ");
             }
         }
         
         return reversed.toString();
     }
     public static void main(String[] agrs){
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
     }
}
