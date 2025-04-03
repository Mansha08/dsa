public class ArmStrong {
    public static boolean arms(int num){
        int k = String.valueOf(num).length();
        int sum = 0;
        int n = num;
        while(n>0){
            int lastd = n%10;
            sum += Math.pow(lastd, k);
            n = n/10;
        }
        return sum == num ? true: false;
    }
    public static void main(String[] args) {
        int num = 143;
        if(arms(num)){
            System.out.println("armstrong number ");
        }else{
            System.out.println("number is not armstron");
        }

        
    }
    
}
