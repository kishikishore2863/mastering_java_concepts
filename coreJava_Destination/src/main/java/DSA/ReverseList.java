package DSA;

public class ReverseList {
    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(4);
        ListNode four = new ListNode(7);
        ListNode five = new ListNode(1);
        ListNode six = new ListNode(2);
        ListNode seven = new ListNode(6);

        ListNode head = one;
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next=seven;

        ListNode i =head;
        while (i!=null){
            System.out.print(i.val);
            i=i.next;
        }

        ListNode res = reverseList.reverseList(head);

        System.out.println();

        while (res!=null){
            System.out.print(res.val);
            res=res.next;
        }
    }
    public  ListNode reverseList(ListNode head) {
        ListNode prev =null;
        ListNode curr = head;
        while(curr!=null ){
            ListNode next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        return prev;
    }
}
