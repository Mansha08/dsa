public class Strong_Number {
    public static int Factorial(int n){
        int fact = 1;
        for(int i =1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static int Strong(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum = sum + Factorial(digit);
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 145;
        int ans = Strong(num);
        if(ans == num && num !=0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        
    }
    
}
