/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ll_mergeSorted {

    public ListNode mergeTwoLists(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (first != null && second != null) {
            if (first.val <= second.val) {
                curr.next = first;
                first = first.next;
            } else {
                curr.next = second;
                second = second.next;
            }
            curr = curr.next;
        }
        if (first != null) {
            curr.next = first;
        }
        if (second != null) {
            curr.next = second;
        }
        return dummy.next;

    }
}