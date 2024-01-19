class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
};

public class ll_lengthOfCycle {
    public static Node merge(Node head) {
        Node slow = head;
        Node fast = head;
        if (head == null || head.next == null) {
            return null;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    public static int lengthOfLoop(Node head) {
        if (merge(head) == null) {
            return 0;
        }
        // Write your code here
        Node curr = merge(head).next;
        int length = 1;
        while (curr != merge(head)) {
            length += 1;
            curr = curr.next;
        }
        return length;
    }
}