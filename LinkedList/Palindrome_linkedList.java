import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class Palindrome_linkedList {

    public static boolean Palindrome(Node head){
        Node temp = head;
        Stack<Integer> st = new Stack<>();

        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;

        while(temp != null){
            if(temp.data != st.peek()){
                return false;
            }
            st.pop();

            temp = temp.next;
        }
        return true;
    }
    public static void printLL(Node head){
        while(head != null){
            System.out.println(head.data + " ");
            head = head.next;
        }
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLL(head);

        // Check if the linked list is a palindrome
        if (Palindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
    
}
