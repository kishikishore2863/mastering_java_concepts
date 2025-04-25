package map;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);

        System.out.println(map);

        System.out.print("Keys : ");
        for (Character i:map.keySet()){
            System.out.print(i);
        }

        System.out.println();

        System.out.print("values : ");
        for (Integer i:map.values()){
            System.out.print(i);
        }

        Map<Character,Integer> kishi = new HashMap<>();
        kishi.put('k',2);
        kishi.put('i',8);
        kishi.put('s',6);
        kishi.put('h',3);


        System.out.println();
        for (Map.Entry<Character,Integer> i : kishi.entrySet()){
            System.out.println(i.getKey()+"->"+i.getValue()+",");
        }

        System.out.println("new ");
        for (Map.Entry<Character,Integer> i : map.entrySet()){
            System.out.println(i.getKey()+"->"+i.getValue()+",");
        }


        HashMap<Character,Integer> original =new HashMap<>();
        original.put('w',1);
        System.out.println(original);
        HashMap<Character,Integer> clone = (HashMap<Character, Integer>) original.clone();
        System.out.println(clone);

        System.out.println(clone.get('w'));
        System.out.println();

        System.out.println(clone.get('w'));


    }
}
