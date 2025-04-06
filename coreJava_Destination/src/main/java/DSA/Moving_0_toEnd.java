package DSA;

import java.util.Arrays;

public class Moving_0_toEnd {
    public static void main(String[] args) {
        int[] nums = {0,0,4,5,0,1,9,0,5};
       int[] res =  mover(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] mover(int[] arr){
        int index =0;
       for(int start=0; start<arr.length; start++){
           if(arr[start]!=0){
               arr[index]=arr[start];
               index++;
           }
       }
       while(index<arr.length){
           arr[index] =0;
           index++;
       }
        return arr;
    }
}
