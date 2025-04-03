public class Maximum_Mininum_digit_number {
    public static void max_min(int n){
        int d;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        while(n!= 0){
            d = n%10;
            mini = Math.min(mini, d);
            maxi = Math.max(maxi, d);
            n = n/10;
        }
        System.out.println("min value = " + mini);
        System.out.println("max value = " + maxi);
    }
    public static void main(String[] args) {
        int n = 3487;
        max_min(n);
        
    }
    
}
