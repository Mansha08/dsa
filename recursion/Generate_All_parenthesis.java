package recursion;

import java.util.*;

public class Generate_All_parenthesis {
    static List<String> res;
    static StringBuilder str;
    static int N;

    public static List<String> generateParenthesis(int n) {
        res = new ArrayList<String>();
        str = new StringBuilder();
        N = n;
        backtrack(0, 0);
        return res;
    }

    public static void backtrack(int open, int close) {
        if (open == N && close == N) {
            res.add(str.toString());
            return;
        }
        if (open < N) {
            str.append('(');
            backtrack(open + 1, close);
            str.setLength(str.length() - 1);
        }
        if (close < open) {
            str.append(')');
            backtrack(open, close + 1);
            str.setLength(str.length() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));

    }

}
