package DSA;

import com.sun.jdi.request.ThreadStartRequest;

import java.util.Arrays;
import java.util.stream.Stream;

public class SlidingWindow {
    public static void main(String[] args) {
        String str ="Hello";
        String needle = "ll";
        System.out.println(strStr(str,needle));




    }

//    public static int[] sortedSquares(int[] nums) {
//        int n = nums.length;
//        int[] out = new int[n];
//        int left =0;
//        int right=n-1;
//        int k=n-1;
//        while(right>=0 && left<n && k>=0){
//            if(Math.abs(nums[right])>Math.abs(nums[left])){
//                out[k]= nums[right]*nums[right];
//                right--;
//            }else{
//                out[k]=nums[left]*nums[left];
//                left++;
//
//            }
//            k--;
//        }
//        return out;
//
//    }

//    public static int[] removeElement(int[] nums, int val) {
//        int start = 0;
//        int end = nums.length-1;
//        while(start<end && end>=0){
//            if(nums[end] == val){
//                nums[end]=0;
//                end--;
//            }
//            if(nums[start] == val ){
//                nums[start]=nums[end];
//                nums[end]=0;
//                end--;
//            }
//            start++;
//        }
//        return nums ;
//    }

//    public static int removeElement(int[] nums, int val) {
//        int value =0;
//        for(int i:nums){
//            if(i!= val){
//                nums[value] =i;
//                value++;
//            }
//        }
//        nums = Arrays.copyOf(nums,value);
//        return value;
//    }

    public static int strStr(String haystack, String needle) {
        int pos = 0;
        for(int i=0; i<haystack.length()-needle.length()+1; i++){
            if(haystack.charAt(i)== needle.charAt(0)){
                pos = i;
                break;
            }
        }
        int start  = pos;
        int end  = needle.length()-1;
        int res = pos;
        int needleStart=0;
        int needleEnd= needle.length()-1;

        while(start <=end && needleStart<=needleEnd){
            if(haystack.charAt(start) != needle.charAt(needleStart)){
                res=-1;
                break;
            }
            start++;
            needleStart++;
        }
        return res;
    }


}
