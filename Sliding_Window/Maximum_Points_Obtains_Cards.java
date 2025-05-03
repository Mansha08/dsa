package Sliding_Window;

public class Maximum_Points_Obtains_Cards {
    public static int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int max= 0;
        for(int i =0;i<k;i++){
            lsum = lsum + cardPoints[i];
            max = Math.max(max, lsum);
        }
        int n = cardPoints.length;
        for(int  i = k-1;i>=0;i--){
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[n-1];
            max = Math.max(max, lsum + rsum);
            n--;
        }
        return max;
    }

    public static void main(String[] args) {
        int k =3;
        int[] cardPoints = {1,2,3,4,5,6,1};
        System.out.println(maxScore(cardPoints, k));
    }
}
