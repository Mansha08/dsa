

class Node {
    int data;
    Node next;

    // Constructor with both data and next pointer
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    // Constructor with only data (next pointer set to null)
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class Search_element_LinkedList {

    public static boolean Search(Node head, int desiredVal) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == desiredVal) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int val = 3; // Element to be checked for presence in the linked list

        // Call the checkifPresent function and print the result
        System.out.print(Search(head, val));
    }

}
