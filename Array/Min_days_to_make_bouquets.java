public class Min_days_to_make_bouquets {
    public static int roseGarden(int bloomday[], int m, int k) {
        long val = (long) m*k;
        int n = bloomday.length;
        if (val > n) {
            return -1;
        }
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, bloomday[i]);
            min = Math.min(min, bloomday[i]);
        }

    //     for (int i = min; i <= max; i++) {
    //         if(possible(bloomday, i, m, k))
    //             return i;
            

    //     }
    //     return -1;
    // }

    //OR
    int low = min, high = max;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(bloomday, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }



    public static boolean possible(int bloomday[], int day, int m, int k) {
        int count = 0;
        int noob = 0;
        for (int i = 0; i < bloomday.length; i++) {
            if (bloomday[i] <= day) {
                count++;
            } else {
                noob += count / k;
                count = 0;
            }
        }
        noob += count / k;
        return noob >= m;

    }

    public static void main(String[] args) {
        int bloomday[] = {7,7,7,13,11,12,7};
        int m = 2;
        int k =3;
        int ans = roseGarden(bloomday, m, k);
        if(ans == -1){
            System.out.println("no bouquet ");
        }else{
            System.out.println("boquets are making : " + ans );
        }

    }

}
