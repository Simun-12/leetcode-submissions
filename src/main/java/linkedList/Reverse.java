package linkedList;

public class Reverse {

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

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode createArrList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = createArrList(arr);
        ListNode newhead = reverseList(head);

        while (newhead != null) {
            System.out.print(newhead.val + " ");
            newhead = newhead.next;
        }
    }
}

