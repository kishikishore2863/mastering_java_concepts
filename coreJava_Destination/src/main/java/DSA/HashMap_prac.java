package DSA;

import java.util.HashMap;
import java.util.Map;

public class HashMap_prac {
    public static void main(String[] args) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);
        hashMap.put(1,2);
        hashMap.put(2,3);
        System.out.println(hashMap);


        hashMap.put(3,4);
        System.out.println(hashMap);

        System.out.println(hashMap.containsKey(0));
        System.out.println(hashMap.containsKey(10));

        Integer get =  hashMap.get(2);//acessing  value using key
        System.out.println(get);

//        hashMap.remove(3);
        System.out.println(hashMap);

        System.out.println(hashMap.size());

        for(int key:hashMap.keySet()){
            System.out.println(key);
        }

        for(int value: hashMap.values()){
            System.out.println(value);
        }
    }
}
