package collectionFrameWork;

import java.util.*;

public class CollectionsMethod  {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Max of list: " + Collections.max(list));
        System.out.println("Min of list: " + Collections.min(list));

        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int res = Collections.binarySearch(list, 5);
        System.out.println("Index of 3: " + res);

        list = Collections.emptyList();
        System.out.println(list);

        Queue<String> rawQueue = new ArrayDeque<>();
        rawQueue.add("Collections");
        Queue<String> checkedQueue = Collections.checkedQueue(rawQueue, String.class);

        checkedQueue.add("Java");
        checkedQueue.add("Collections");
        checkedQueue.add("Collections");

        System.out.println(checkedQueue);

        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Collections");
        vector.add("Enumeration");
        Enumeration<String> enumeration = vector.elements();
        List<String> listFromEnumeration = Collections.list(enumeration);
        System.out.println("List from Enumeration: " + listFromEnumeration);


    }

}
