package linkedList;

public class DeleteMiddleNode {
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
    public static ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode prev = new ListNode(0);
        ListNode curr = head ;
        ListNode fast =head;
        prev.next = head;
        while(fast!= null && fast.next!= null){
            prev = curr;
            curr = curr.next;
            fast = fast.next.next;
        }
        prev.next = curr.next;
        curr.next= null;
        return head;
    }
    public static void main(String[] args){
        int[]  nums = {1,2,3,4};
        ListNode head = createList(nums);
        ListNode newHead = deleteMiddle(head);
        for(int i=0; i<nums.length-1; i++){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
