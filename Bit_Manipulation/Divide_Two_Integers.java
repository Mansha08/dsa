package Bit_Manipulation;

public class Divide_Two_Integers {
    public static int divide(int divident, int divisor) {
        if (divident == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        double ans = (divident / divisor);
        int ans1 = (int) ans;

        return ans1;

    }

    public static void main(String[] args) {
        int divident = 10;
        int divisor = 3;
        System.out.println(divide(divident, divisor));

    }

}
