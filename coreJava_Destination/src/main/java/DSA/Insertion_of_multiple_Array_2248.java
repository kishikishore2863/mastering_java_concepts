package DSA;

import java.util.*;

public class Insertion_of_multiple_Array_2248 {
    public static void main(String[] args) {
        int [][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
       List<Integer> list =  intersection(nums);
    }


    public static List<Integer> intersection(int[][] nums) {
        Map<Integer,Integer> count = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                count.put(nums[i][j],count.getOrDefault(nums[i][j],0)+1);
            }
        }
        System.out.println(count);
        List<Integer> ans = new ArrayList<>();
        for(int key : count.keySet()){
            System.out.println("key:"+key);
            if(count.get(key) ==nums.length){
                System.out.println("length:"+nums.length);
                System.out.println("addedKey:"+key);
                ans.add(key);
            }
        }
        Collections.sort(ans);
        System.out.println(ans);
        return ans;
    }
}
