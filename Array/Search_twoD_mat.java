import java.util.ArrayList;
import java.util.Arrays;

public class Search_twoD_mat {
    public static boolean Search(ArrayList<ArrayList<Integer>> mat, int target){
        int n = mat.size();
        int m = mat.get(0).size();
        int low =0;
        int high = n*m -1;
        while(low<= high){
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m;
            if(mat.get(row).get(col) == target){
return true;
            }else if(mat.get(row).get(col) < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
        mat.add(new ArrayList<>(Arrays.asList(5,6,7,8)));
        mat.add(new ArrayList<>(Arrays.asList(9,10,11,12)));
        int target = 8;
        System.out.println(Search(mat, target));

        
    }
    
}
