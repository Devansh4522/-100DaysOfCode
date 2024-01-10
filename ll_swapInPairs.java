class swapInPairs {
    public ListNode swapPairs(ListNode head) {
        // recursive approach
        // if (head == null || head.next == null) return head;
        // ListNode second = head.next;
        // ListNode third = second.next;
        // second.next = head;
        // head.next = swapPairs(third);
        // return second;

        // iterative approach
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode firstNode = current.next;
            ListNode secondNode = current.next.next;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            current.next = secondNode;
            current = current.next.next;
        }

        return dummy.next;

    }
}