public class AUTOMORPHIC {

    public static boolean isAuto(int n){
        int sq = n*n;
        while(n>0){
            if(n%10 != sq%10){
                return false;
            }
            n /= 10;
            sq /= 10;
            
        } 
        return true;
    }
    public static void main(String[] args) {
        int n = 76;
        if(isAuto(n) == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
    
}
