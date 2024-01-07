
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class ll_DeleteWithoutHead {

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            // Cannot delete the last node or null node
            return;
        }

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
