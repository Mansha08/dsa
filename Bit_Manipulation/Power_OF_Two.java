
package Bit_Manipulation;

import java.util.*;

public class Power_OF_Two {
    public static boolean power(int n) {

        if (n == 1 || n == 2) {
            return true;
        }
        if (n == 0) {
            return false;
        }

        // use power function - 0(1)
        // for(int i =0;i<n;i++){
        // if(n == Math.pow(2, i)){
        // return true;

        // }
        // }
        // return false;

        // use recursion - 0(logn)
        return (n % 2 == 0 && power(n / 2));
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(power(n));

    }

}
