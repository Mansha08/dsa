package Stack_Queue;

import java.util.Stack;

class Next_Greater_element {
    public static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= arr[i % n]) {
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty() == false)
                    nge[i] = st.peek();
                else
                    nge[i] = -1;
            }
            st.push(arr[i % n]);

        }
        return nge;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 1, 2, 6, 0 };

        int arr2[] = nextGreaterElements(arr);
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}