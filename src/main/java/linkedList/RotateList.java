package linkedList;

public class RotateList {
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
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int length = 0;
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int n = k % length;
        if (n == 0) return head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp1 = slow.next;
        slow.next = null;
       ListNode newHead = temp1;
       fast.next = head;
       return newHead;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int k = 3;
        ListNode head = createList(nums);
        ListNode newHead = rotateRight(head,k);
        while(newHead!=null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
