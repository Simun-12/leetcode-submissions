package linkedList;

public class PalindromeList {
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
    public static ListNode reverse(ListNode start){
        ListNode prev = null;
        ListNode current = start;
        while(current!=null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
    public static boolean isPalindrome(ListNode head) {
        boolean res = true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = reverse(slow);
        ListNode first = head;
        while(mid != null){
            if(first.val != mid.val ) return false;
            first = first.next;
            mid =mid.next;
        }
        return res;
    }
    public static void main(String[] args){
        int[] head = {1,2,2,1};
        ListNode newHead = createList(head);
        System.out.println(isPalindrome(newHead));
    }
}
