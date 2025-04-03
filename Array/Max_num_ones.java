import java.util.ArrayList;
import java.util.Arrays;

public class Max_num_ones {
    public static int ones(ArrayList<ArrayList<Integer>> mat, int n, int m){
        int cnt_max = 0;
        int index = -1;
        for(int i =0;i<n;i++)
        {
            int cnt_ones = 0;
            for(int j =0;j<m;j++){
                cnt_ones+= mat.get(i).get(j);
            }
            if(cnt_ones > cnt_max){
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(1,1,1)));
        mat.add(new ArrayList<>(Arrays.asList(0,0,1)));
        mat.add(new ArrayList<>(Arrays.asList(0,0,0)));
        int n =3, m =3;
        System.out.println(ones(mat, n, m));

    }
    
}
