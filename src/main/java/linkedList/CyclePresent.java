package linkedList;

public class CyclePresent {
    public static boolean hasCycle(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       boolean flag = false;

       while(fast!= null && fast.next != null){
           if(slow == fast) flag = true;
           slow= slow.next;
           fast = fast.next.next;
       }
       return flag;
    }
    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
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
        boolean flag = hasCycle(head);
        System.out.println(flag);
    }
}
