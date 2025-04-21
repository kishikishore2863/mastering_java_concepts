package collectionFrameWork;

import java.util.*;
import java.util.stream.Collectors;

public class Arraylist {
    public static void main(String[] args) {
//        ArrayList al = new ArrayList();
//        al.add(1);
//        al.add(2);
//        al.add(3);
//        al.add(4);
//        al.add(4,5);
//        al.addFirst(0);
//        System.out.println(al);
//        List<Integer> stack = new Stack<>();
//        stack.add(1);
//        stack.add(2);
//        stack.add(3);
//        stack.add(4);
//        stack.add(5);
//        System.out.println(stack);
//        System.out.println(stack.getFirst());


//        LinkedList<Integer> linkedList =new LinkedList<>();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.add(4);
//        System.out.println(linkedList);
////        System.out.println(linkedList.peek());
////        System.out.println(linkedList.poll());
//        System.out.println("peek :"+linkedList.peek());
//
//        linkedList.offerFirst(0);
//        linkedList.offerLast(5);
//        System.out.println(linkedList);


        Queue<Integer> arrayqueue = new ArrayDeque<>();
        arrayqueue.add(1);
        arrayqueue.add(2);
        arrayqueue.add(3);
        arrayqueue.add(4);
        arrayqueue.add(5);
        System.out.println(arrayqueue);
        arrayqueue.offer(0);
        System.out.println(arrayqueue);
        arrayqueue.add(0);
        System.out.println(arrayqueue);

       Queue arrayDeque1 = arrayqueue = arrayqueue.stream()
                               .filter(e -> e == 0)
                               .collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println(arrayDeque1);
    }
}
