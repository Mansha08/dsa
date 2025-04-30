package Stack_Queue;

import java.util.Stack;

public class Area_Largest_Rectangle {

    public static int Area(int histo[]){
        Stack<Integer> st = new Stack<>();
        int n = histo.length;
        int maxA = 0;
        for(int i =0;i<n;i++){
            while(!st.isEmpty() && (i==n || histo[st.peek()] >= histo[i])){
                int height = histo[st.peek()];
                st.pop();
                int width;
                if(st.isEmpty())
                width = i;
                else 
                 width = i -st.peek() -1;
                 maxA = Math.max(maxA, width*height);

            }
            st.push(i);
        }
return maxA;
   }
    public static void main(String[] args) {int histo[] = {3, 1, 5, 6, 2, 3};
    System.out.println("The largest area in the histogram is  = " + Area(histo));
        
    }

    
}
