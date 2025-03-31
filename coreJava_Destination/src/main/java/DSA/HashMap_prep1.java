package DSA;

import java.util.*;

public class HashMap_prep1 {
    public static void main(String[] args) {
//        int [] nums = {1,2,3,4,5,6,7,8,9,99,102};
//       List<Integer> res =  findNumbers(nums) ;
//        System.out.println(res);

//       boolean res= checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
//        System.out.println(res);
//        int [] nums = {1,0,3};
//        int [] nums = {9,6,4,2,3,5,7,0,1};
          int [] nums = {0,1};
        missingNumber(nums);

    }

    public static List<Integer> findNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> numsSet = new HashSet<>();

        for (int num: nums) {
            numsSet.add(num);
        }
        System.out.println(numsSet);

        for (int num: numsSet) {
            if (!numsSet.contains(num + 1) && !numsSet.contains(num - 1)) {
                ans.add(num);
            }
        }

        return ans;
    }


    public static boolean checkIfPangram(String sentence) {
        int [] hash = new int[26];
        for(int i=0; i<sentence.length(); i++){
            int temp = sentence.charAt(i)-'a';
            hash[temp]=1;
        }
        for(int i=0; i<hash.length; i++){
            if(hash[i]!=1){
                return false;
            }
        }
        return true;
    }


    public static void missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);

        System.out.println(numSet);

        int expectedNumCount = nums.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                System.out.println(number);
            }
        }

    }


}
