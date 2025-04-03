import java.util.*;
public class Factors_of_number {
    
    public static void factors(int  n){
       
        for(int i =1;i<=n;i++){
            if(n%i == 0){

                System.out.println(i+ " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt() ;
        factors(n);
        
    }
    
}
