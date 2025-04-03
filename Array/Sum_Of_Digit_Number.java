import java.util.*;
public class Sum_Of_Digit_Number {
    public static int sum(int n){
        int sum =0;
        while(n!=0){
            int d = n%10;
            sum += d;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));


        
    }
    
}
