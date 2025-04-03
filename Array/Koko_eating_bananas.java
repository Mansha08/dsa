public class Koko_eating_bananas {
    public static int findMax(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, piles[i]);
        }
        return maxi;
    }
    public static int calculateTotalhours(int[] piles, int hourly) {
        int totalH = 0;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double) (piles[i]) / (double) (hourly));
        }
        return totalH;
    }
    public static int minimumRateToEat(int[] piles, int h) {
        int low =1, high = findMax(piles);
        while(low <= high){
            int mid = (low+high)/2;
            int totalH = calculateTotalhours(piles, mid);
            if(totalH <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] piles = { 7, 15, 6, 3 };
        int h = 8;
        int ans = minimumRateToEat(piles, h);
        System.err.println("koko should eat at least : " + ans + " banana/hr");

    }

}
