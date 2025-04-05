package DSA;

import java.util.*;

public class Max_Sum_2342 {


    public static void main(String[] args) {
        int [] nums = {18,43,36,13,7};
//        int[] nums = {1, 0, 5, 3};
        System.out.println(maximumSum(nums));

    }

    public static int maximumSum(int[] nums) {
        Map<Integer,List<Integer>> hash = new HashMap<>();
        int max=-1;

        for(int num:nums){
            int digitSum = sumOfDigit(num);
            if(!hash.containsKey(num)){
                hash.put(digitSum,new ArrayList<>());
            }
            hash.get(digitSum).add(num);
        }
        System.out.println(hash);

        for(int key:hash.keySet()){
            List<Integer> arr = hash.get(key);
            if(arr.size()>1){
                Collections.sort(arr, Collections.reverseOrder());
                max = Math.max(max,arr.get(0)+arr.get(1));
            }
        }

        return max;
    }

    public static int sumOfDigit(int num){
        int sum = 0;
        while(num>0){
            int last =num%10;
            sum += last;
            num=num/10;
        }
        return sum;
    }

}