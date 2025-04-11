package TCSNQTPrepSession;



class start1{
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


        ListNode res = middleNode(head);
        while(res != null){
            System.out.print(res.val+"->");
            res = res.next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;


    }


}
