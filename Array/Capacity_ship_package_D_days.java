public class Capacity_ship_package_D_days {
    public static int findDays(int weights[], int days) {
        int n = weights.length,  cap = 1,  load = 0;
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > days) {
                cap += 1;
                load = weights[i];
            } else {
                load += weights[i];
            }   }
        return cap; 
     }
    public static int leastweight(int weights[], int d) {
        int low = Integer.MIN_VALUE,  high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);  }
        while (low <= high) {
            int mid = (low + high) / 2;
            int numberofDays = findDays(weights, mid);
            if (numberofDays <= d) {
                high = mid - 1;
            } else {
                low = mid + 1;   }  }
        return low;
    }

    public static void main(String[] args) {
        int weights[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int d = 1;
        int ans = leastweight(weights, d);
        System.err.println(ans);

    }

}
