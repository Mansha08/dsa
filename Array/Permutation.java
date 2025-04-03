public class Permutation {
    public static void main(String[] args) {
        int n =5;
        int r= 3;
        int ans = 1;
        for(int i = n;i>=n-r+1;i--){
            ans *=i;
        }
        System.out.println(ans);
    }
    
}
