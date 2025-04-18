package TCSNQTPrepSession;

import java.util.Arrays;

class Testing{
    public static void main(String[] args) {
        Testing testing = new Testing();
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};
        int [] res = testing.combineArr(arr1,arr2);
        System.out.println(Arrays.toString(res));



    }
   public int[] combineArr(int[] arr1, int[] arr2 ){
        int arr1start = 0;
        int arr2start = 0;

        int resIndex = 0;

        int[] res = new int[arr1.length+arr2.length];

        while(resIndex<res.length-1){
            if(arr1[arr1start]<arr2[arr2start]){
                res[resIndex] = arr1[arr1start];
                arr1start++;
                resIndex++;
            }else{
                res[resIndex] = arr2[arr2start];
                arr2start++;
                resIndex++;
            }


        }

        return res;
   }
}





