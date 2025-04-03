public class Fibonacci {
 static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fn1 = Fibonacci(n-1);
        int fn2 = Fibonacci(n-2);
        int sum = fn1 + fn2;
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fibonacci(n));
        
    }
    
}
