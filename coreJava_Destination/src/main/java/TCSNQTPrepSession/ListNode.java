package TCSNQTPrepSession;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}



class start{
    public static void main(String[] args) {
           ListNode one = new ListNode(1);
           ListNode two = new ListNode(2);
           ListNode three = new ListNode(3);
           ListNode four = new ListNode(4);
           ListNode five = new ListNode(5);

           ListNode head = one;
           one.next = two;
           two.next = three;
           three.next = four;
           four.next = five;
           ListNode i = head;
           while (i != null) {
               System.out.print(i.val + "->");
               i = i.next;
           }


           ListNode curr = head;
           ListNode prev = null;
           while (curr != null) {
               ListNode next = curr.next;
               curr.next = prev;
               prev = curr;
               curr = next;
           }
           System.out.println();
           while (prev != null) {
               System.out.print(prev.val + "->");
               prev = prev.next;
           }



    }
}