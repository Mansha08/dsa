package Bit_Manipulation;

public class Min_Bit_Flips_Convert_Number {
    public static int minBitflips(int start, int goal) {
        int ans = 0;
        int xor = start ^ goal;
        while (xor != 0) {
            ans += xor & 1;
            xor >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int start = 10;
        int gaol = 7;
        System.out.println(minBitflips(start, gaol));

    }

}
