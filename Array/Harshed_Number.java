import java.util.*;

public class Harshed_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = Integer.toString(num);
        int sum = 0;
        for(int i =0;i<s.length();i++){
            sum += s.charAt(i) - '0';
                        
        }
        if(num % sum == 0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
