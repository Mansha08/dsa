import java.util.*;
public class replace_element_rank {
    public static void main(String[] args) {
        int arr[] = {20,15,26,2,98,6};
        int n = arr.length;
        for(int i =0;i<n;i++){
            Set<Integer> s = new HashSet<Integer>();
            for(int j =0;j<n;j++){
                if(arr[j]<arr[i]){
                    s.add(arr[j]);

                }
            }
            int rank = s.size()+1;
            System.out.println("rank is = " + rank);
        }
    }
    
}
