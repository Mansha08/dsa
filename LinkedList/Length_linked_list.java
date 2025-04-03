package LinkedList;

class Node {
    public int data;
    public Node next;

    // Constructor with both data and next node
    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data (assuming next is initially null)
    public Node(int data1) {
        data = data1;
        next = null;
    }
}

public class Length_linked_list {

    public static int length(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 7 };
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        // Print the length of the linked list
        System.out.println(length(head));
    }

}
