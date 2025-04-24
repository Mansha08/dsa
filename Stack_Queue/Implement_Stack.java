package Stack_Queue;

import java.util.*;

public class Implement_Stack {
    public static void main(String[] args) {
        stack s = new stack();
        s.push(3);
        s.push(7);
        s.push(6);
        System.out.println("top of the stack before deleting top element = " + s.top());
        System.out.println(" size of the stack before deleting top element = " + s.size());
        System.out.println("the element deleted is = " + s.pop());
        System.out.println(" Size of the stack after deleting an element = " + s.size());
        System.out.println("top of the stack after deleting an element = " + s.top());

    }

}

class stack {
    int size = 1000;
    int arr[] = new int[size];
    int top = -1;

    void push(int x) {
        top++;
        arr[top] = x;
    }

    int pop() {
        int x = arr[top];
        top--;
        return (x);
    }

    int top() {
        return arr[top];
    }

    int size() {
        return top + 1;
    }

}