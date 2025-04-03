public class Reverse_OF_Digit {
    public static int reverse(int n ){
        int d;
        int rev=0;
        while(n != 0){
            d = n%10;
            rev = rev*10 +d;
            n = n/10;
            
        }
        return rev;
    }
    public static void main(String[] args) {
        int n =  1234;
    int result = reverse(n);
    System.out.println(result);

        
    }
    
}
