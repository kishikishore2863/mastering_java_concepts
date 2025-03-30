package DSA;

import java.util.Arrays;

public class MoveZeros_283 {
    public static void main(String[] args) {
        int [] nums = {1,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        int start =1;
        int end = nums.length;
        int count=0;
        while(start<end){
            if(nums[start] != 0){
                nums[count] = nums[start];
                count++;
            }
            start++;
        }
        System.out.println(Arrays.toString(nums));

    }
}
