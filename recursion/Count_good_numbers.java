package recursion;

public class Count_good_numbers {
    static long mod = 1000000007;

    public static int Countnumber(long n) {
        return (int) ((quick(5, (n + 1) / 2) * quick(4, n / 2)) % mod);
    }

    public static long quick(int x, long y) {
        long ret = 1;
        long mul = x;
        while (y > 0) {
            if (y % 2 == 1) {
                ret = (ret * mul) % mod;
            }
            mul = (mul * mul) % mod;

            y /= 2;
        }
        return ret;
    }

    public static void main(String[] args) {
        long n = 4;
        System.out.println(Countnumber(n));

    }

}
