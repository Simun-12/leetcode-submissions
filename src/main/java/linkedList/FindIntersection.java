package linkedList;

public class FindIntersection {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        if (lenA > lenB) {
            int diff = lenA - lenB;
            while (diff-- > 0) {
                ptrA = ptrA.next;
            }
        } else {
            int diff = lenB - lenA;
            while (diff-- > 0) {
                ptrB = ptrB.next;
            }
        }
        while (ptrA != null && ptrB != null) {
            if (ptrA == ptrB) {
                return ptrA;
            }
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }
        return null;
    }
    private static int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;
        ListNode intersection = getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection at node value: " + intersection.val);
        } else {
            System.out.println("No intersection");
        }
    }
}