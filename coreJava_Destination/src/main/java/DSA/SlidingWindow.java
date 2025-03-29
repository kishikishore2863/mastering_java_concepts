package DSA;

import com.sun.jdi.request.ThreadStartRequest;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SlidingWindow {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,2,3};
        int k =2;
       boolean res = containsNearbyDuplicate(nums,k);
        System.out.println(res);






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

//    public static int strStr(String haystack, String needle) {
//        int pos = 0;
//        for(int i=0; i<haystack.length()-needle.length()+1; i++){
//            if(haystack.charAt(i)== needle.charAt(0)){
//                pos = i;
//                break;
//            }
//        }
//        int start  = pos;
//        int end  = needle.length()-1;
//        int res = pos;
//        int needleStart=0;
//        int needleEnd= needle.length()-1;
//
//        while(start <=end && needleStart<=needleEnd){
//            if(haystack.charAt(start) != needle.charAt(needleStart)){
//                res=-1;
//                break;
//            }
//            start++;
//            needleStart++;
//        }
//        return res;
//    }


//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int end = m+n-1;
//        m--;
//        n--;
//        while( m>=0 && n>=0){
//            if(nums2[n]>nums1[m]){
//                nums1[end] = nums2[n];
//                end--;
//                n--;
//            }else{
//                nums1[end] = nums1[n];
//                end--;
//                m--;
//            }
//        }
//        System.out.println(Arrays.toString(nums1));
//    }


//    public static boolean isPalindrome(String s) {
//        s=s.toLowerCase();
//        s= s.replaceAll("[^a-zA-Z0-9]","");
//        System.out.println(s);
//        int start= 0;
//        int end = s.length()-1;
//        while (start<=end && end>=0){
//            if(s.charAt(start) != s.charAt(end)){
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }

//    input:s = "1101100111"
//    output:   1111100111
//    public static void slidingWindow(){
//      int k= 100;
//      int[] arr = {10,5,2,6};
//
//      int left =0;
//      int curr =1;
//      int ans =0;
//
//      for(int right=0; right< arr.length; right++){
//          curr*=arr[right];
//          while(curr>=k){
//            curr = curr/arr[left];
//            left++;
//          }
//          ans +=right-left+1;
//      }
//        System.out.println(ans);
//    }


//    public static void fixedWindow(){
//        int k=4;
//        int[] arr = {1,12,-5,-6,50,3};
//        int startIndex = 0;
//        int endIndex = k;
//        int sum = 0;
//        int maxSum = sum;
//        for(int i=0; i<k; i++ ){
//            sum+=arr[i];
//        }
//        while(endIndex < arr.length){
//            sum-=arr[startIndex];
//            startIndex++;
//            sum+=arr[endIndex];
//            endIndex++;
//            maxSum = Math.max(maxSum,sum);
//        }
//        System.out.println(maxSum/k);
//    }

//    public static void fixedWindow(){
//        String s = "abcabcbb";
//        int out=0;
//
//        HashSet<Character> set = new HashSet<>();
//
//        int leftBound = 0;
//        for(int rightBound=0; rightBound<s.length(); rightBound++){
//            while(set.contains(s.charAt(rightBound))){
//                set.remove(s.charAt(leftBound));
//                leftBound++;
//            }
//            set.add(s.charAt(rightBound));
//            out=Math.max(out,rightBound-leftBound+1);
//        }
//        System.out.println(out);
//    }
public static boolean containsNearbyDuplicate(int[] nums, int k) {
    for(int i=0; i<nums.length; i++){
        for(int j=i+1; j<nums.length; j++){
            if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                return true;
            }
        }

    }
    return false;
}
}






