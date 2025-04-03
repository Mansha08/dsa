import java.util.ArrayList;
import java.util.Arrays;
public class Search_Row_Col {
    public static boolean SearcBoth(ArrayList<ArrayList<Integer>> mat, int target){
        int n = mat.size();
        int m = mat.get(0).size();
        int row =0;
        int col = m-1;
        while(row<n && col>=0){
            if(mat.get(row).get(col) == target){
                return true;
            }else if(mat.get(row).get(col) < target){
                row++;
            }else{
                col--;
            }
        }
    return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(1,2,3,4,11)));
        mat.add(new ArrayList<>(Arrays.asList(5,6,7,8,23)));
        mat.add(new ArrayList<>(Arrays.asList(9,10,11,12,15)));
        mat.add(new ArrayList<>(Arrays.asList(91,110,111,112,115)));

        
    boolean Search =   SearcBoth(mat, 8);
    System.out.println(Search ? "true" : "false");
        
    }
    
}
