package DSA;

public class RevsreMidList {
}
class Solution {
    public ListNode swapPairs(ListNode head) {
        // Check edge case: linked list has 0 or 1 nodes, just return
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = head.next;     // Step 5
        ListNode prev = null;           // Initialize for step 3
        while (head != null && head.next != null) {
            if (prev != null) {
                prev.next = head.next;  // Step 4
            }
            prev = head;                // Step 3

            // Step 2
            ListNode nextNode = head.next.next;
            head.next.next = head;      // Step 1

            head.next = nextNode;       // Step 6
            head = nextNode;            // Move to next pair (Step 3)
        }

        return dummy;
    }
}
