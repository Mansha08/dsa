public class Binary_Search {
    public static int binary(int arr[], int low, int high, int target){
        while(low>high)
        return -1;
        int mid = (low+high)/2;
        if(arr[mid] == target)
        return mid;
        else if(target>arr[mid]) return binary(arr, mid+1, high, target);
        return binary(arr, low, mid-1, target);

    }
    public static int search(int[] nums, int target) {
        return binary(nums, 0, nums.length - 1, target);
    }
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = search(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
        
    }
    

