public class Multiple_of_three {
    public static boolean sumof(int n){
        int d;
        int sum =0;

       while(n>0){
        d = n%10;
        sum+= d;
        n /=10;

       }
       if(sum%3 == 0){
        return true;
       }
       return false;
    }
    public static void main(String[] args) {
        int n = 33;

        System.out.println(sumof(n));
        
    }
    
}
