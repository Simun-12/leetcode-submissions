package linkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    public  class Node{
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key,int val){
            this.key = key;
            this.val= val;
            this.prev = null;
            this.next = null;
        }
    }

    Map<Integer,Node> map;
    int maxCapacity;
    Node head;
    Node tail;

    public  LRUCache(int capacity) {
     this.maxCapacity = capacity;
     this.map = new HashMap<>();
    }

    public  int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        shiftNodeFront(node);
        return node.val;
    }

    public  void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            shiftNodeFront(node);
            return;
        }
        if (map.size() == maxCapacity) {
            removeNode(head);
        }
        Node newNode = new Node(key, value);
        map.put(key, newNode);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

    }
    private void shiftNodeFront(Node node){
        if(node == tail) return;
        if(node == head){
            head = head.next;
            if(head != null) head.prev=null;
        }
        else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        node.prev = tail;
        node.next = null;
        tail.next = node;
        tail = node;
    }
    private void removeNode(Node node){
        map.remove(node.key);
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }
}
