import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Matrix_Median {
    public static int median(int mat[][], int m, int n){
        List<Integer>lst = new ArrayList<>();
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++)
            {
                lst.add(mat[i][j]);
            }
        }
        Collections.sort(lst);
        return lst.get((m*n)/2);
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4,5},{8,9,11,12,13}, {21,23,25,27,29}};
        int m = mat.length, n = mat[0].length;
        int ans = median(mat, m, n);
        System.out.println(ans);
        
    }
    
}
