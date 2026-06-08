package linkedList;

import java.util.List;

public class PartionList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode createList(int[] nums){
        ListNode head = new ListNode(nums[0]);
        ListNode current =head;
        for(int i=1; i<nums.length; i++){
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }
    public static ListNode partition(ListNode head, int x) {
        ListNode start = new ListNode(0);
        ListNode end = new ListNode(0);
        ListNode startHead = start;
        ListNode endHead = end;
        while(head != null){
            if(head.val < x){
                startHead.next = new ListNode(head.val);
                startHead = startHead.next;
            }
            else{
                endHead.next = new ListNode(head.val);
                endHead = endHead.next;
            }
            head = head.next;
        }
        startHead.next = end.next;
        return start.next;
    }
    public static void main(String[] args){
        int[] nums = {1,4,3,2,5,2};
        int x =3;
        ListNode head = createList(nums);
        ListNode newHead = partition(head,x);
        for(int i =0; i< nums.length; i++){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }

    }
}
