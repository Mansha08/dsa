public class Prime_Range_sum_of_digit_prime {
    public static boolean isprime(int num){
        if(num<=1){
return false;
        }
        for(int i =2; i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;

    }

    public static int sum(int num){
        int sum =0;
        while(num>0){
            sum+=num%10;
            num/= 10;

        }
        return sum;
    }

    public static int count(int a, int b){
        int count =0;
        for(int  num =a;num<=b;num++){
            if(isprime(num) && isprime(sum(num))){
                System.out.println(num);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 28;
        System.out.println(count(a, b));
        
    }
    
}
