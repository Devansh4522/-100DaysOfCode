class removeNthNodeFromBack {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int length = 0;
        while (curr != null) {
            length += 1;
            curr = curr.next;
        }
        curr = head;
        if (length - n == 0) {
            head = head.next;
        } else {
            for (int i = 1; i < length - n; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        return head;
    }
}