public class Remove_outermost_parenthesis {
    public static String removeOuterMost(String s) {
        int counter =0;
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '('){
                if(counter != 0){
                    sb.append(s.charAt(i));
                }
                counter++;
            }else{
                counter--;
                if(counter !=0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
    String str = "(()()) (())";
    System.out.println(removeOuterMost(str));
        
        

    }

}
