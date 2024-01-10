/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * }
 * 
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * 
 * Node(int data, Node next)
 * {
 * this.data = data;
 * this.next = next;
 * }
 * };
 * 
 *****************************************************************/

public class ll_reverseInGroups {
    static int lengthOfLinkedList(Node head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }

    public static Node kReverse(Node head, int k) {
        // Write your code here.
        if (head == null || head.next == null)
            return head;

        int length = lengthOfLinkedList(head);

        Node dummyHead = new Node(0);
        dummyHead.next = head;

        Node pre = dummyHead;
        Node cur;
        Node nex;

        while (length >= k) {
            cur = pre.next;
            nex = cur.next;
            for (int i = 1; i < k; i++) {
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            length -= k;
        }
        return dummyHead.next;
    }
}