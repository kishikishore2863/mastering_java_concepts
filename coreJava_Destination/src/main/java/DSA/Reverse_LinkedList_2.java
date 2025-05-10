package DSA;

import java.util.List;

public class Reverse_LinkedList_2 {
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




       ListNode res =  reverseBetween(head,2,4);

//       while(res!=null){
//           System.out.println(res.val+"->");
//           res = res.next;
//       }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;

        for(int i=1; i<left; i++){
            dummy = dummy.next;
            curr =curr.next;
        }
        System.out.println("curr:"+curr.val);



        ListNode prev = null;
        for(int i=1; i<=right-left+1; i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        dummy.next.next = curr;
        dummy.next = prev;


     return null;
    }

}
