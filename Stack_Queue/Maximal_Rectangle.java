package Stack_Queue;

public class Maximal_Rectangle {
    public int maximalRectangle(char[][] matrix) {
        int res = Integer.MIN_VALUE;
         int[] heights = new int[matrix[0].length];
         for (int i=0; i<matrix.length; i++) {
 
             for (int j=0; j<matrix[0].length; j++) {
                 heights[j] = matrix[i][j]=='1' ? heights[j]+1 : 0;
             }
 
             // find largest rectangle in histogram
             int[] stack = new int[heights.length];
             int idx = -1;
             for (int j=0; j<=heights.length; j++) {
                 int currBarHeight = j!=heights.length ? heights[j] : 0;
                 while (idx>-1 && heights[stack[idx]] >= currBarHeight) {
                     int height = heights[stack[idx]];
                     idx -= 1;
                     int width = idx>-1 ? j-stack[idx]-1 : j;
                     int area = height * width;
                     res = Math.max(res, area);
                 }
                 idx += 1;
                 stack[idx] = j;
             }
         }
         return res;
     }
    
    
}
