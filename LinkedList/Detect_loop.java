package LinkedList;

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

public class Detect_loop {

    public static boolean Loop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;

            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        // Check if there is a loop
        // in the linked list
        if (Loop(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }

    }
    
}
