package DSA;

import java.util.*;

public class Minimum_Consecutive_Cards_2260 {
    public static void main(String[] args) {
        int[] cards = {3,4,2,3,4,7};
        int res = minimumCardPickup(cards);
        System.out.println(res);
    }

    public static int minimumCardPickup(int[] cards) {
        Map<Integer, List<Integer>> hash = new HashMap<>();
        for(int i=0; i<cards.length; i++){
            int c= cards[i];
            if(!hash.containsKey(c)){
                hash.put(c,new ArrayList<>());
            }
            hash.get(c).add(i);
        }
        int ans=Integer.MAX_VALUE;
        System.out.println(hash);
        for (int key: hash.keySet()){
            List<Integer> arr = hash.get(key);
            int count =0;
            for(int i=0; i<arr.size()-1; i++){
//                System.out.println(arr.get(i ) - arr.get(i) + 1);
                ans = Math.min(ans,arr.get(i+1) - arr.get(i) + 1);

            }
//            ans = Math.min(ans,);
        }
        return ans;
    }
}
