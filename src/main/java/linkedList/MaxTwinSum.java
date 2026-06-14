package linkedList;

public class MaxTwinSum {
    private static class ListNode{
        int val;
        ListNode next;
         ListNode(int val){
             this.val = val;
             this.next = null;
         }
    }
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp;
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static int pairSum(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       while(fast!=null){
           slow=slow.next;
           fast = fast.next.next;
       }
       ListNode newH = reverseList(slow);
       int max =0;
       ListNode temp = head;
       while(newH != null){
           max = Math.max(max, newH.val+ temp.val);
           newH = newH.next;
           temp = temp.next;
       }
       return max;
    }


    public static ListNode createArrList(int [] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for(int i=1; i<arr.length; i ++){
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,5,7,15};
        ListNode head = createArrList(arr);
        int ans = pairSum(head);
        System.out.println(ans);
    }
}
