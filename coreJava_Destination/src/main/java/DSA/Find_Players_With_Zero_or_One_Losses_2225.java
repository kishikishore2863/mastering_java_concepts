package DSA;

import java.util.*;

public class Find_Players_With_Zero_or_One_Losses_2225 {
    public static void main(String[] args) {
        int[][] matches ={{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
       List<List<Integer>> result =  findWinners(matches);

    }

    public static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> losers = new HashMap<>();
        for(int i =0; i<matches.length; i++){
            for(int j=1; j<matches[i].length; j++){
                losers.put(matches[i][j],losers.getOrDefault(matches[i][j],0)+1);
            }
        }
        List<Integer> winners = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<matches.length; i++){
            for(int j=0; j<matches[i].length-1; j++){
                if(!losers.containsKey(matches[i][j])){
                    set.add(matches[i][j]);
                }
            }
        }
        winners.addAll(set);


        List<Integer> loserList = new ArrayList<>();

        for(int key : losers.keySet()){
            if(losers.get(key)==1){
                loserList.add(key);
            }
        }
        System.out.println(winners);
        System.out.println(loserList);
        List<List<Integer>> result = new ArrayList<>();
        result.add(winners);
        result.add(loserList);
        System.out.println(result);
        Collections.sort(winners);
        Collections.sort(loserList);
        return result;
    }
}
