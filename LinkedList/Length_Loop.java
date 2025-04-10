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

public class Length_Loop {

    public static int findLength(Node slow, Node fast){
        int count =1;
        fast = fast.next;
        if(slow != fast){
            count++;
            fast = fast.next;
        }
        return count;

    }

    public static int lengthLoop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                return findLength(slow, fast);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Create a loop from fifth to second
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // This creates a loop
        fifth.next = second; 

        int loopLength = lengthLoop(head);
        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
    
}
