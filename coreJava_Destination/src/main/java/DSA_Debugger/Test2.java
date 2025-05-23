package DSA_Debugger;


import DSA.ListNode;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
//        System.out.println(simplifyPath("/home/"));
//        System.out.println(simplifyPath("/home/user/Documents/../Pictures"));
//        System.out.println(simplifyPath("/home//foo/"));


    }

//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i=0; i<nums.length; i++){
//            int value =target - nums[i];
//            if(map.containsKey(value)){
//                return new int[]{map.get(value),i};
//            }
//            map.put(nums[i],i);
//        }
//        System.out.println(map);
//    return new int[]{0,0};
//    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }



    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> s_stack = new Stack<>();
        Stack<Character> t_stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!s_stack.isEmpty() && s.charAt(i)=='#'){
                s_stack.pop();
            }
            if(s.charAt(i)!='#'){
                s_stack.push(s.charAt(i));
            }
        }
        for(int i=0; i<t.length(); i++){
            if(!t_stack.isEmpty() && t.charAt(i)=='#'){
                t_stack.pop();
            }
            if(t.charAt(i)!='#'){
                t_stack.push(t.charAt(i));
            }
        }
        System.out.println("s :"+s_stack);
        System.out.println("t :"+t_stack);
        return s_stack.toString().equals(t_stack.toString());
    }

    public  static boolean isPalindrome(int x) {
        if(x<0)return false;
        int clone =x;
        int x1 =0;
        while(x>0){
            int lastDigit = x%10;
            x1 = x1*10+lastDigit;
            x=x/10;
        }
        System.out.println(clone);
        System.out.println(x1);
        return clone==x1;
    }
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

//    public static String simplifyPath(String path) {
//        Stack<Character> stack = new Stack();
//        for(int i=0; i<path.length(); i++){
//            if(path.charAt(i)>='A' && path.charAt(i)<='Z' || path.charAt(i)>='a' && path.charAt(i)<='z'){
//                stack.push(path.charAt(i));
//            }else if (path.charAt()){
//
//            }
//        }
//    }


}


class ManualStringSplit {
    public static void main(String[] args) {
        String str = "Hello World Java Program";
        char delimiter = ' ';  // You can change this to any character

        String[] result = manualSplit(str, delimiter);

        for (String word : result) {
            System.out.println(word);
        }
    }

    public static String[] manualSplit(String str, char delimiter) {
        int count = 1; // at least one word
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == delimiter) {
                count++;
            }
        }

        String[] parts = new String[count];
        int partIndex = 0;
        StringBuilder currentPart = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != delimiter) {
                currentPart.append(str.charAt(i));
            } else {
                parts[partIndex++] = currentPart.toString();
                currentPart.setLength(0); // reset
            }
        }

        parts[partIndex] = currentPart.toString(); // add last part
        return parts;
    }



}


class Demo{
    public static void main(String[] args) {
//        String s ="/home//foo/";
        String s ="/.../a/../b/c/../d/./";
//         split = s.split("/");
        System.out.println();
        Hashtable<Integer,Integer> hashtable =new Hashtable<>();
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.set();

    }



}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp =head;
        ListNode temp2 = head;

        List<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);

        int start =0;
        while(temp2!=null){
            temp2.val = list.get(start);
            start++;
            temp2 = temp2.next;
        }

        return head;
    }
}

