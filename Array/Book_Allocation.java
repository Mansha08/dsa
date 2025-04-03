import java.util.*;
public class Book_Allocation {
    public static int countStudent(ArrayList<Integer> arr, int pages) {
        int n = arr.size(), students = 1;
        long pagesstudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesstudent + arr.get(i) <= pages) {
                pagesstudent += arr.get(i);
            } else {   students++;
                pagesstudent = arr.get(i); } }
        return students;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if (m > n)
            return -1;
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countStudent(arr, mid);
            if (students > m) {  low = mid + 1;
            } else {
                high = mid - 1;
            }   } return low;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n = 5;
        int m = 4;
        int ans = findPages(arr, n, m);
        System.out.println(ans);

    }

}
