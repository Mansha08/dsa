import java.util.*;
public class Abudant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;

        for(int i =1;i<=n;i++){
            if(n%i == 0){
                sum += i;
            }
        }
        sum -= n;
        if(sum>n){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
    
}
