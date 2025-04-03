import java.util.*;
class Prime_range {
    public static boolean isprime(int n){
        if(n ==1){
            return false;
        }
        for(int i =2;i<Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primerange(int a, int b){
        for(int i =a;i<=b;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    primerange(a, b);
        
    }
}