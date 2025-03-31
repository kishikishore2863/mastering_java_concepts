package DSA;

public class Minimum_size_subArray_209 {
    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        int res =  minSubArrayLen(7,nums);
        System.out.println(res);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int count = 0;
        int leftBound =0;
        for(int rightBound = 0; rightBound<nums.length; rightBound++){
            if(count > target){
                count = 0;
                leftBound=rightBound;
            }

            count +=  nums[rightBound];

            if(count == target){
                return rightBound-leftBound+1;
            }


        }

        return 0;
    }
}
