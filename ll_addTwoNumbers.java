class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head, temp;
        head = temp = null;
        int n, k = 0;
        while (l1 != null || l2 != null) {
            n = k;
            if (l1 != null) {
                n += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                n += l2.val;
                l2 = l2.next;
            }
            int r = n % 10;
            k = n / 10;
            if (temp == null) {
                temp = head = new ListNode(r);
            } else {
                temp.next = new ListNode(r);
                temp = temp.next;
            }

        }
        if (k > 0) {
            temp.next = new ListNode(k);
        }
        return head;
    }
}