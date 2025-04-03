public class Reverse_words_String {
    public static String result(String s) {
        int left = 0;
        int right = s.length() - 1;
        String ans = "";
        String temp = "";
        while (left <= right) {
            char ch = s.charAt(left);
            if (ch != ' ') {
                temp += ch;
            } else if (ch == ' ') {
                if (!ans.equals("")) {
                    ans = temp + " " + ans;
                } else {
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }
        if (!temp.equals("")) {
            if (!ans.equals("")) {
                ans = temp + " " + ans;

            } else {
                ans = temp;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        String s = "this is an apple";
        System.out.println("before traversing");
        System.out.println(s);
        System.out.println("After reverse");
        System.out.print(result(s));

    }

}
