package DSA;

import java.util.Arrays;

public class K_Radius_Subarry_2090 {
    public static void main(String[] args) {
        int [] nums = {7,4,3,9,1,8,5,2,6};
        int[] out = getAverages(nums,3);
        System.out.println(Arrays.toString(out));
    }

    public static int[] getAverages(int[] nums, int k) {
        int [] out = new int[nums.length];
        for(int i=0; i<out.length; i++){
            out[i] = -1;
        }
        int [] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        System.out.println(Arrays.toString(prefix));
        int left = 0;
        for(int right =nums.length-k; right<nums.length; right++ ){
            int sum =0;
            if(left == 0){
                sum  = prefix[right]/((right+1)-left);
            }else{
                sum = (prefix[right]-prefix[left-1])/((right+1)-left);
            }
            out[((right+1)+left)/2] = sum;
            left++;
        }
        return out;
    }
}
