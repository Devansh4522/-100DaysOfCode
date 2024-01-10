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
 * }
 * 
 *****************************************************************/

public class ll_sort0s1s2s {
    public static Node sortList(Node head) {
        // Write your code here
        Node zerohead = new Node(-1);
        Node onehead = new Node(-1);
        Node twohead = new Node(-1);
        Node zero = zerohead;
        Node one = onehead;
        Node two = twohead;
        Node temp = head;
        if (head == null || head.next == null) {
            return head;
        }
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            }
            if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            }
            if (temp.data == 2) {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        // if(zerohead.next!=null){
        // return zerohead.next;
        // }
        if (onehead.next != null) {
            zero.next = onehead.next;
        } else {
            zero.next = twohead.next;
        }
        one.next = twohead.next;
        two.next = null;
        if (zerohead.next != null) {
            return zerohead.next;
        } else {
            if (onehead.next != null) {
                return onehead.next;
            } else {
                return twohead.next;
            }
        }

    }
}