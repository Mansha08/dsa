import java.util.*;
public class Sum_Of_Given_Range {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum =0;
        for(int i = l;i<=r;i++){
            sum += i;
        }
        System.out.println(sum);
        
    }
    
}
