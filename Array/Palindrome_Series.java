import java.util.*;
public class Palindrome_Series {
    public static boolean idPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;

        }
        if (n == rev) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        for (int i = min; i <= max; i++) {
            if (idPalindrome(i)) {
                System.out.println(i);

            }
        }
    }

}
