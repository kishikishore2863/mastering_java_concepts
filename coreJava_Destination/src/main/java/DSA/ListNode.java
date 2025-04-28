package DSA;

import java.util.*;

public class ListNode {
   public int val;
   public ListNode next;
   ListNode(int val){
       this.val = val;
   }
}


class start{
    public static void main(String[] args) {
        ListNode one  = new ListNode(1);
        ListNode two  = new ListNode(1);
//        ListNode three  = new ListNode(1);

        ListNode head = one;
        one.next = two;
//        two.next = three;

      ListNode head1 = deleteDuplicates(head);

        while (head1 !=null){
            System.out.println(head1.val);
            head1 = head1.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while(curr != null && curr.next !=null  ){
            if(curr.next.val == curr.val){
                curr.next = curr.next.next;
            }else curr = curr.next;
        }
        return head;
    }

}
