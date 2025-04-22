package Bit_Manipulation;
public class XOR_Range {
    public static int xorUpto(int n) {
        if (n % 4 == 0)
            return n;
        else if (n % 4 == 1)
            return 1;
        else if (n % 4 == 2)
            return n + 1;
        else
            return 0;
    }

    public static int xor(int L, int R) {
        return xorUpto(R) ^ xorUpto(L - 1);

    }

    public static void main(String[] args) {
        int L = 1;
        int R = 3;
        System.out.println("XOR from " + L + " to " + R + " is: " + xor(L, R));

    }

}
