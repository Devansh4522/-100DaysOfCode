/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class ll_startOfLL {
    public ListNode merge(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode nul = null;
        if (head == null || head.next == null) {
            return nul;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return nul;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode curr = head;
        ListNode meet = merge(head);
        if (meet == null) {
            return null;
        } else {
            while (curr != meet) {
                curr = curr.next;
                meet = meet.next;
            }
        }
        return curr;
    }
}