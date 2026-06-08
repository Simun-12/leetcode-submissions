package linkedList;

public class OddEven {
   private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static ListNode oddEvenList(ListNode head) {
         ListNode odd = head;
         ListNode even = odd.next;
         ListNode evenhead = even;
         while(even!=null && even.next!= null){
             odd.next= even.next;
             odd= odd.next;
             even.next= odd.next;
             even = even.next;
         }
         odd.next=evenhead;
         return head;
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
        int[] arr = {1,2,3,4,5};
        ListNode head = createArrList(arr);
        ListNode ans = oddEvenList(head);
        while(ans!=null){
            System.out.print(ans.val  + "");
            ans = ans.next;
        }
    }
}
