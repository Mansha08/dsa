package Stack_Queue;

import java.util.HashMap;
import java.util.Map;
class Node {
    int key, value;
    Node next, prev;
    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }  }

public class LRU {
  
   int cap;
    Map<Integer, Node> map;
    Node head, tail;
    public LRU(int capacity) {
       this.cap = capacity;
        this.map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);    
        head.next = tail;
        tail.prev = head;      }    
    public int get(int key) {
         if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node); 
            return node.value;   } 
        return -1;            } 
    public void put(int key, int value) {
     if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            node.value = value;
            return;  }
        if (map.size() == cap) {
            Node node = tail.prev;
            map.remove(node.key);
            node.prev.next = tail;
            tail.prev = node.prev;
            node.next = null;
            node.prev = null;  }
        insertFirst(key, value);
    }
    public void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
        node.next = null;
        node.prev = null;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }
    public void insertFirst(int key, int value) {
        Node node = new Node(key, value);
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
       node.prev = head;
        map.put(key, node);
    }
}
    
    

