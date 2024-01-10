
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
import java.util.*;

public class ll_intersectionOfYLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> mp = new HashMap<>();
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if (headA == null || headB == null) {
            return null;
        }
        while (temp1 != null || temp2 != null) {
            if (temp1 != null) {
                if (!mp.containsKey(temp1)) {
                    mp.put(temp1, 1);
                } else {
                    return temp1;
                }
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                if (!mp.containsKey(temp2)) {
                    mp.put(temp2, 1);
                } else {
                    return temp2;
                }
                temp2 = temp2.next;
            }

        }
        return null;
    }
}