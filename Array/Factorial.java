public class Factorial {
    static int fac(int x){
        int ans = 1;
        for(int i =1;i<=x;i++){
            ans = ans*i;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        System.err.println(fac(5));
        
    }
    
}
