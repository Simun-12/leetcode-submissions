package linkedList;

public class MergeNodesBtwZero {

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
    public static ListNode mergeNodes(ListNode head) {
        int sum =0;
        ListNode ans = new ListNode(0);
        ListNode tail = ans;
        ListNode curr = head.next;
        while(curr!= null){
            if(curr.val == 0){
                ans.next = new ListNode(sum);
                sum =0;
                ans = ans.next;
            }
            else{
                sum += curr.val;
            }
            curr = curr.next;
        }
        return tail.next;
    }
    public static void main(String[] args){
        int[] nums ={0,3,1,0,4,5,2,0};
        ListNode head = createList(nums);
        ListNode newHead = mergeNodes(head);
        while(newHead!=null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
