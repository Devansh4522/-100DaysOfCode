
/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * public Node prev;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * this.prev = null;
 * }
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * this.prev = null;
 * }
 * Node(int data, Node next, Node prev)
 * {
 * this.data = data;
 * this.next = next;
 * this.prev = prev;
 * }
 * }
 * 
 *****************************************************************/

public class ll_d_deleteAllOccur {
    public static Node deleteAllOccurrences(Node head, int k) {
        // Write your code here.
        if (head == null) {
            return head;
        }
        Node curr = head;
        while (curr != null) {
            if (curr.data == k && curr == head) {
                curr = curr.next;
                head = head.next;
            } else {
                if (curr.data != k) {
                    curr = curr.next;
                } else {
                    curr.prev.next = curr.next;
                    curr = curr.next;
                }
            }
        }
        return head;
    }
}