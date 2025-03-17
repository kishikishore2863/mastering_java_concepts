package Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23,43, 12,7,56,89,44,22,39};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        for (Integer i:arr ){
            System.out.print(i+", ");
        }
    }

    public static void bubble(int[] arr ){
        int temp =0;
        for(int i=0; i< arr.length-1; i++ ){
            for(int j=i+1; j< arr.length; j++ ) {
                if(arr[i]>arr[j]){
                temp =arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                }
            }
        }
    }
}
