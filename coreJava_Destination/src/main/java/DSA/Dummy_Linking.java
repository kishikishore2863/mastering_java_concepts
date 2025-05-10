package DSA;

import java.util.List;

public class Dummy_Linking {
    public static void main(String[] args) {
        ListNode one  = new ListNode(1);
        ListNode two   = new ListNode(2);
        ListNode three  = new ListNode(3);
        ListNode four  = new ListNode(4);
        ListNode five   = new ListNode(5);
        ListNode six   = new ListNode(6);
        ListNode seven   = new ListNode(7);
        ListNode eight   = new ListNode(8);
        ListNode nine   = new ListNode(9);
        ListNode ten   = new ListNode(10);


        ListNode head = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        seven.next = eight;
        eight.next = nine;
        nine.next = ten;

        ListNode res = costum(head);

    }


    public static  ListNode costum(ListNode head){
        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int index = 5;

        while (index>0){
            curr = curr.next;
            index--;
        }

        System.out.println(dummy.val);

        ListNode start =dummy;
        dummy.next = null;
        ListNode prev =null;
        ListNode curr1 = start;
        ListNode nextNode ;

        while(curr1 !=null){
           nextNode = curr1.next;
           curr1.next = prev;
           prev = curr1;
           curr1 = nextNode;
        }

        curr.next = prev;


        while(dummy!=null){
            System.out.println(dummy.val);
            dummy = dummy.next;
        }

       return null;
    }



}
class Solution1 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Empty list
        if (head == null) {
            return null;
        }

        // Move the two pointers until they reach the proper starting point
        // in the list.
        ListNode cur = head, prev = null;
        while (m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }

        // The two pointers that will fix the final connections.
        ListNode con = prev, tail = cur;

        // Iteratively reverse the nodes until n becomes 0.
        ListNode third = null;
        while (n > 0) {
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            n--;
        }

        // Adjust the final connections as explained in the algorithm
        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
    }
}