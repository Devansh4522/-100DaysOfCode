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

public class ll_rotate {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        if (head == null || head.next == null)
            return head;
        for (int i = 0; i < k; i++) {
            Node temp = head;
            while (temp.next.next != null)
                temp = temp.next;
            Node end = temp.next;
            temp.next = null;
            end.next = head;
            head = end;
        }
        return head;
    }
}