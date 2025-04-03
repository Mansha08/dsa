public class Find_Missing_Number_Array {
    // public static int missing(int[] a, int n) {
    //     int xor1 = 0, xor2 = 0;
    //     for (int i = 0; i < n-1; i++) {
    //         xor2 = xor2 ^ a[i];
    //         xor1 = xor1 ^ (i + 1);
    //     }
    //     xor1 = xor1 ^ n;
    //     return (xor1 ^ xor2);
    // }

    public static int missing(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1)/2);
        int sumnum = 0;
        for(int num: nums){
         sumnum  += num;
        }
        return sum - sumnum;
    }


    public static void main(String[] args) {
        int n= 5;
        int a[] = {1, 2, 4, 5};
        int ans = missing(a);
        System.out.println(ans);

    }
}
