package Bit_Manipulation;

public class Sieve_Eratothenes {
    public static int countPrimes(int n) {
        if (n <= 2)
            return 0;
        boolean[] primes = new boolean[n];
        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }
        for (int p = 2; p * p < n; p++) {
            if (primes[p]) {
                for (int i = p * p; i < n; i += p) {
                    primes[i] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
        
    }
    
}
