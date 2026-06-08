package linkedList;

import java.util.List;

public class PalindromLinkedList {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public boolean isPalindrome(ListNode head) {

        return false;
    }
    public static ListNode createArrayList(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for(int i=1; i<arr.length; i++){
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,1};
        ListNode head = createArrayList(arr);

    }
}
