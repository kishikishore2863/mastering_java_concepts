package DSA;

public class Linking_LinkedList {
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


        int left = 5;
        ListNode curr = head;

        while(left>0){
            curr = curr.next;
            left--;
        }

        ListNode start = curr.next;
        curr.next = null;

        System.out.println("start->"+start.val);

        ListNode prev = null;
        ListNode curr1 = start;
        ListNode third = null;
        while(curr1!=null){
            third = curr1.next;
            curr1.next = prev;
            prev = curr1;
            curr1 = third;
        }
        curr.next = prev;

        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }





    }
}
