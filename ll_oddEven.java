public class ll_oddEven {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode odd = oddHead;
        ListNode even = evenHead;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }

        if (odd != null) {
            odd.next = null;
        }

        if (even != null) {
            even.next = null;
        }

        odd.next = evenHead;
        return oddHead;
    }
}
