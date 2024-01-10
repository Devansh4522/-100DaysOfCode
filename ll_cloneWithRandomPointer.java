import java.util.*;

class Node {
    public int data;
    public Node next;
    public Node random;

    Node() {
        this.data = 0;
        this.next = null;
        this.random = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }

    Node(int data, Node next, Node random) {
        this.data = data;
        this.next = next;
        this.random = random;
    }
}

public class ll_cloneWithRandomPointer {
    public static Node cloneLL(Node head) {
        HashMap<Node, Node> hashMap = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            Node newNode = new Node(temp.data);
            hashMap.put(temp, newNode);
            temp = temp.next;
        }
        Node t = head;
        while (t != null) {
            Node node = hashMap.get(t);
            node.next = (t.next != null) ? hashMap.get(t.next) : null;
            node.random = (t.random != null) ? hashMap.get(t.random) : null;
            t = t.next;
        }
        return hashMap.get(head);
    }
}