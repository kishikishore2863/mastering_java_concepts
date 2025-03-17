package TCS_NQT;

import java.util.Arrays;

public class PalindromeString {
    public static void main(String[] args) {
        int [] test ={2,7,11,15};
       int [] arr = twoSum(test,9);
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isPalindrome(String str){
        int start =0;
        int end =str.length()-1;
        while (start< end){
            if(str.charAt(start) != str.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }



//    public static int[] twoSum(int[] numbers, int target) {
//        int[] res = new int[2];
//        int start = 0;
//        int end  = numbers.length-1;
//        while(start<end){
//            int curr = numbers[start] + numbers[end] ;
//            if(curr == target){
//                res[0] = start+1;
//                res[1] = end+1;
//            }
//            if (curr>target){
//                end--;
//            }else{
//                start++;
//            }
//        }
//        return res;
//    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int end  = numbers.length-1;
        for(int i=0; i<=end; i++){
            for(int j=i+1; j<=end; j++){
                if(numbers[i]+numbers[j] == target){
                    res[0]=i+1;
                    res[1]= j+1;
                }
            }
        }
        return res;
    }
}
