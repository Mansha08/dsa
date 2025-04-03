import java.util.*;

public class Prime_Factors {

    static ArrayList<Integer>getprime(int n){
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i =2;i<=n;i++){
            if(n%i == 0){

                prime.add(i);
            }
            while(n%i == 0){
                n = n/i;
            }
        }
        return prime;
    }

    public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ans = getprime(n);
        System.out.println(ans);
    }
    
}
