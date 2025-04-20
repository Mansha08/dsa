package recursion;

import java.util.ArrayList;
import java.util.List;

public class Expression_Operators {
    public static List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        func(0, 0, 0, target, num, "", res);
        return res;
    }
    private static void func(int idx, long prev, long currValue, int target, String num, String expr, List<String> res) {
        //base case
        if (idx == num.length()) {
            if (currValue == target) {
                res.add(expr);
            }
            return;
        }
        for (int i = idx; i < num.length(); i++) {
            String curr = num.substring(idx, i + 1);
            long currNo = Long.parseLong(curr);
            if (curr.length() > 1 && curr.charAt(0) == '0')
              break;
            if (idx == 0)
                func(i + 1, currNo, currNo, target, num, expr + currNo, res);
            else {
                func(i + 1, currNo, currValue + currNo, target, num, expr + "+" + currNo, res);
                func(i + 1, -currNo, currValue - currNo, target, num, expr + "-" + currNo, res);
                func(i + 1, prev * currNo, currValue - prev + (prev * currNo), target, num, expr + "*" + currNo, res);

            }
        }

    }
    public static void main(String[] args) {
        String num = "123";
        int target = 6;
        System.out.println(addOperators(num, target));
    }
    
}
