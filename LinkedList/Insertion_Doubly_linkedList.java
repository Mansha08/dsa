import java.util.*;

 class Node {
    public int data;
    public Node next;
    public Node back;

    public Node(int data1, Node next1, Node back1) {
        data = data1;
        next = next1;
        back = back1;
    }

    public Node(int data1) {
        data = data1;
        next = null;
        back = null;
    }

}

public class Insertion_Doubly_linkedList {


    private static Node convertArr2DLL(int[] arr) {
        // Create the head node with the first element of the array
        Node head = new Node(arr[0]);
        // Initialize 'prev' to the head node
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            // Create a new node with data from the array and set its 'back' pointer to the previous node
            Node temp = new Node(arr[i], null, prev);
            // Update the 'next' pointer of the previous node to point to the new node
            prev.next = temp;
            // Move 'prev' to the newly created node for the next iteration
            prev = temp;
        }
        // Return the head of the doubly linked list
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            // Print the data in the current node
            System.out.print(head.data + " ");
            // Move to the next node
            head = head.next; // Move to the next node
        }
        System.out.println();
    }
    
    // Function to insert a new node with value 'k' at the end of the doubly linked list
    private static Node insertAtTail(Node head, int k) {
        // Create a new node with data 'k'
        Node newNode = new Node(k);
    
        // If the doubly linked list is empty, set 'head' to the new node
        if (head == null) {
            return newNode;
        }
    
        // Traverse to the end of the doubly linked list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
    
        // Connect the new node to the last node in the list
        current.next = newNode;
        newNode.back = current;
    
        return head;
        }


    

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        // Convert the array to a doubly linked list
        Node head = convertArr2DLL(arr);
        
        // Print the doubly linked list
         System.out.println("Doubly Linked List Initially: ");
        print(head);

        System.out.println("Doubly Linked List After Inserting before the node with value 8:");

        head = insertAtTail(head, 10); // Insert a node with value 10 at the end
        print(head);

    }
}
