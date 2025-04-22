package collectionFrameWork;

import java.util.*;
import java.util.stream.Collectors;

public class Arraylist {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(4, 5);
        System.out.println("ArrayList: " + al);

        // Stack
        List<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        System.out.println("Stack: " + stack);
        System.out.println("Stack First: " + ((Stack<Integer>) stack).peek());

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println("LinkedList: " + linkedList);
        System.out.println("peek :" + linkedList.peek());
        linkedList.offerFirst(0);
        linkedList.offerLast(5);
        System.out.println("LinkedList after offerFirst/offerLast: " + linkedList);

        // ArrayDeque as Queue
        Queue<Integer> arrayqueue = new ArrayDeque<>();
        arrayqueue.add(1);
        arrayqueue.add(2);
        arrayqueue.add(3);
        arrayqueue.add(4);
        arrayqueue.add(5);
        System.out.println("ArrayDeque (Queue): " + arrayqueue);
        arrayqueue.offer(0);
        System.out.println("After offer(0): " + arrayqueue);
        arrayqueue.add(0);
        System.out.println("After add(0): " + arrayqueue);
        Queue arrayDeque1 = arrayqueue.stream()
                .filter(e -> e == 0)
                .collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println("Filtered ArrayDeque (only 0s): " + arrayDeque1);

        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2); // duplicate
        System.out.println("HashSet: " + hashSet);

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println("TreeSet (Sorted): " + treeSet);

        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 3);
        hashMap.put("Banana", 2);
        hashMap.put("Cherry", 5);
        System.out.println("HashMap: " + hashMap);

        // PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(2);
        pq.add(1);
        pq.add(3);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("Poll from PriorityQueue: " + pq.poll());
        System.out.println("After Poll: " + pq);
    }
}
