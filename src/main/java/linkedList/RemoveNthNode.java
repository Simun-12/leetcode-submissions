package linkedList;

public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while(n > 0){
            fast = fast.next;
            n--;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }
    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
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
            int[] arr = {1};
            int n = 1;

            ListNode head = createArrList(arr);
            ListNode newhead=  removeNthFromEnd(head,n);

            while(newhead!=null){
                System.out.print(newhead.val +" ");
                newhead= newhead.next;
            }
        }
}

}


