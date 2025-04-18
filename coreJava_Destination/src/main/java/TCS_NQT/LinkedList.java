package TCS_NQT;


import java.util.Arrays;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;

    }
}
class Solution {

    public static void main(String[] args) {
        Solution solution=new Solution();
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
        ListNode i = head;
        while (i != null) {
            System.out.print(i.val + "->");
            i = i.next;
        }
        System.out.println();
        ListNode ii = solution.deleteMiddle(head);
        while (ii != null) {
            System.out.print(ii.val + "->");
            ii = ii.next;
        }

    }

    public ListNode deleteMiddle(ListNode head) {
        ListNode clone = head;
        ListNode prev = head;

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        while(prev!=slow){
            prev=prev.next;
        }
//        System.out.println(prev.val);
//        return ;
//       return slow;
//        Arrays.sort();
        return head;
    }
}
