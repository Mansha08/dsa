public class Perfect_number {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
            if (sum == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 6;
       if(isPerfect(n)){
        System.err.println("perfect number");
       }else{
        System.out.println("not perfect number");
       }

    }

}
