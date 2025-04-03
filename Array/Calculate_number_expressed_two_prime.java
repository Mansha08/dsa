public class Calculate_number_expressed_two_prime {
    public static boolean prme(int n){
        if(n<=1){
            return false;
        }
        for(int i =2;i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static  boolean isprime(int n){
        if(prme(n) && prme(n-2)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 19;
        if(isprime(n)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
