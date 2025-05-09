package DSA;

import java.util.List;

public class ReorderList_143 {

    public static void main(String[] args) {
       ListNode one =new  ListNode(1);
       ListNode two =new  ListNode(2);
       ListNode three =new  ListNode(3);
       ListNode four =new  ListNode(4);

       ListNode head = one;
       one.next = two;
       two.next = three;
       three.next = four;


      ListNode ans = reorderList(head);
        System.out.println();
      while(ans!=null){
          System.out.print(ans.val+"->");
          ans = ans.next;
      }
    }


    public static ListNode reorderList(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode first = head;
        ListNode second = reverse(slow.next);
        slow.next =null;


        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(first!=slow && second != null ){
            curr.next = first;
            curr = curr.next;
            first = first.next;
            curr.next = second;
            curr = curr.next;
            second = second.next;

        }
        if(first == null){
            curr.next = second;
        }else{
            curr.next = first;
        }
        head = dummy.next;

        return dummy.next;
    }

    private static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

}
