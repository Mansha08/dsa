

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

public  class Reverse_linkedList {

    public static Node ReverseLinkedListUsingStack(Node head) {

        // Initialize'temp' at
        // head of linked list
        Node temp = head;  
        
        // Initialize pointer 'prev' to NULL,
        // representing the previous node
        Node prev = null;  
        
        // Traverse the list, continue till
        // 'temp' reaches the end (NULL)
        while(temp != null){  
            // Store the next node in
            // 'front' to preserve the reference
            Node front = temp.next;  
            
            // Reverse the direction of the
            // current node's 'next' pointer
            // to point to 'prev'
            temp.next = prev;  
            
             // Move 'prev' to the current
             // node for the next iteration
            prev = temp;  
            
             // Move 'temp' to the 'front' node
             // advancing the traversal
            temp = front; 
        }
        
        // Return the new head of
        // the reversed linked list
        return prev;  
     
         }
     
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        head = ReverseLinkedListUsingStack(head);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
        
    }
    
}
