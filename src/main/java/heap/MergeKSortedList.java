package heap;

import java.util.PriorityQueue;

public class MergeKSortedList {
    private static class ListNode{
        int val ;
        ListNode next ;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val - b.val);
        for(ListNode list:lists){
            while(list!=null){
                pq.add(list);
                list = list.next;
            }
        }
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        while(!pq.isEmpty()){
            curr.next = new ListNode(pq.poll().val);
            curr = curr.next;
        }
        return head.next;
    }
}
