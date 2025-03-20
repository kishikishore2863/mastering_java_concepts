package TCS_NQT;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
//        System.out.println(twoPointer());
//        zero();
        ThreeSum();
    }

    public static String twoPointer(){
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        int start =0;
        int end =arr.length-1;
        String str="";
        while(start<end){
            if((arr[start]+arr[end]) == target){
                 str = arr[start]+"+"+arr[end];
            }
            start++;
            end--;
        }
        return str;
    }

    //Example: arr = [0, 1, 0, 3, 12] → Output: [1, 3, 12, 0, 0]

    public static void zero(){
        int[] arr = {0, 1, 0, 3, 12};
        int start = 0;
        int i=0;
        int end = arr.length;
        while (start<end){
            if(arr[start] != 0){
                int temp = arr[i];
                 arr[i] =arr[start];
                 arr[start] = temp;
                 i++;
            }
            start++;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void  ThreeSum(){
        int[] arr = {2, -1, -1, 3, -1};
        int[] arr2 = new int[5];
        Set<List<Integer>> triplet = new HashSet<>();

        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n-1;j++ ){
                for(int k=j+1; k<n-2; k++){
                   if(arr[i]+arr[j]+arr[k] == 0){
                       List<Integer> temp = new ArrayList<>();
                       temp.add(i);
                       temp.add(j);
                       temp.add(k);
                       Collections.sort(temp);
                       triplet.add(temp);
                   }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(triplet);
        System.out.println(ans);
    }

}
