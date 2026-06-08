package linkedList;

public class AddTwoNumbers {
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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        ListNode head1 = l1;
        ListNode head2 = l2;
        int sum=0, carry=0;
        while(head1!=null || head2 !=null || carry!=0){
            sum = carry;
            if(head1 != null){
                sum+= head1.val;
                head1 = head1.next;
            }
            if(head2 != null){
                sum+= head2.val;
                head2 = head2.next;
            }
             carry = sum/10;
             sum = sum%10;
             ans.next = new ListNode(sum);
             ans = ans.next;
        }
        return temp.next;
    }
    public static void main(String[] args){
        int[] l1 = {2,4,3}, l2 = {5,6,4};
        ListNode head1 = createList(l1);
        ListNode head2 = createList(l2);
        ListNode newHead = addTwoNumbers(head1,head2);
        while(newHead!=null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
