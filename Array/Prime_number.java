import java.util.Scanner;

/**
 * Prime_number
 */
public class Prime_number {
    public static boolean isprime(int n){
        int count =0;
        for(int i =1;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                count = count+1;

                if(n/i != i){
                    count = count +1;
                }
            }
        }
        if(count  == 2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime =isprime(n);
       if(prime){

        System.err.println("prime");
       }else{
        System.out.println("not prime");
       }
       
    }
}