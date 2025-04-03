class Aggresive_cows {
    public static boolean cantakeplace(int stalls[], int dist, int cows) {
        int n = stalls.length, cntcows = 1, last = stalls[0];
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last >= dist) {
                cntcows++;
                last = stalls[i]; }
            if (cntcows >= cows) {
                return true;
            } }  return false;
    }

    public static int aggresivecows(int stalls[], int k) {
        int n = stalls.length, low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (cantakeplace(stalls, mid, k) == true) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }   }
        return high;
    }

    public static void main(String[] args) {
        int stalls[] = { 0, 3, 4, 7, 10, 9 };
        int k = 4;
        int ans = aggresivecows(stalls, k);
        System.out.println(ans);

    }
}