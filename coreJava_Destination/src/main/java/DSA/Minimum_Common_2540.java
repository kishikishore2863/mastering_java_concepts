package DSA;

public class Minimum_Common_2540 {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int [] nums2 = {2,4};
       int res = getCommon(nums,nums2);
        System.out.println(res);
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        int common = 0;
        int start = 0;
        int end = nums1.length;
        int start2 = 0;
        int end2 = nums2.length;
        while(start<end && start2<end2){
            if(nums1[start]<nums2[start2]){
                start++;
            }else {
                start2++;
            }
            if(nums1[start]==nums2[start2]){
                common = nums1[start];
            }else{
                start++;
                start2++;
            }
        }
        return common;
    }
}
