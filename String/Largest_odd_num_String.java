public class Largest_odd_num_String {
    public static String largestOddNumber(String num) {
        for(int i = num.length()-1;i>=0;i--){
          if((num.charAt(i) -'0')%2 != 0)
          return num.substring(0,i+1);
        }
        return "";
          
      }
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
        

    }
    
}
