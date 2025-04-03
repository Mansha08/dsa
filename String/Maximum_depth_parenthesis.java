import java.util.Stack;

class Maximum_depth_parenthesis{

    public static int maxDepth(String s) {
        Stack<Character> st =new Stack<>();
        int count =0;
        int ans = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
                count++;
                ans = Math.max(ans, count);
            }
            else if(s.charAt(i) == ')'){
                st.pop();
                count--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));

        
    }
}