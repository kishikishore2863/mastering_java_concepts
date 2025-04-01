package DSA;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow_Counting {

    public static void main(String[] args) {
        Map<Character,Integer> count = new HashMap<>();
        String s = "eceba";
        int k=2;

        int leftBound = 0;
        for(int rightBound= 0; rightBound<s.length(); rightBound++){
            count.put(s.charAt(rightBound), count.getOrDefault(s.charAt(rightBound),0)+1);
            System.out.println(count);

            while(count.size()>k){
                count.put(s.charAt(leftBound),count.getOrDefault(s.charAt(leftBound),0)-1);
                System.out.println(count);
                if(count.get(s.charAt(leftBound)) == 0){
                    count.remove(s.charAt(leftBound));
                }
                leftBound++;
                System.out.println(count);
            }
        }
    }
}
