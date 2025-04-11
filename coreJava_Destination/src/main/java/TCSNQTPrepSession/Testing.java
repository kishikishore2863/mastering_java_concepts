package TCSNQTPrepSession;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int [] res =sortedSquares(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] sortedSquares(int[] nums) {
        int start =0;
        int end =nums.length-1;
        int index = nums.length-1;
        int [] res = new int[nums.length];
        int square = 0;
        while(start<end){
            if(nums[start]*nums[start]< nums[end]*nums[end]){
                square=nums[end]*nums[end];
                end--;
            }else {
                square=nums[start]*nums[start];
                start++;
            }
            res[index] =square;
            index--;

        }
       return res;
    }
}
