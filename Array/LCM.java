import java.util.*;
public class LCM {
    public static int LCM(int a, int b){
        if(b ==0){
return a;
        }
        return LCM(b, a%b);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = LCM(a, b);
        int l = (a*b)/lcm;
        System.out.println(l);
    }
    
}
