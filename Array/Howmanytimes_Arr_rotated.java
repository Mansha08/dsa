public class Howmanytimes_Arr_rotated {
    public static int times(int n, int arr[]) {
        int ans = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        int n = 5;
        System.out.println(times(n, arr));

    }

}
