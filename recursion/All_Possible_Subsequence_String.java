package recursion;

public class All_Possible_Subsequence_String {

    public static void solve(int i, String s, String f) {
        if (i == s.length()) {
            System.err.println(f + "");
            return;
        }
        // pick the element
        solve(i + 1, s, f + s.charAt(i));
        // pop the element
        solve(i + 1, s, f);
    }

    public static void main(String[] args) {

        String s = "abc";
        String f = "";
        System.out.println("All possible subsequence = ");
        solve(0, s, f);
    }

}
