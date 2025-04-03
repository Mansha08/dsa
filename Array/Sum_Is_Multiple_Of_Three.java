public class Sum_Is_Multiple_Of_Three {
    public static boolean sum(int n){
        int sum =0;
        while(n>0){
            int d = n%10;
            sum +=d;
            n = n/10;
        }
        if(sum%3 == 0){
            return true;

        }
        return false;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(sum(n));
        
    }
}
