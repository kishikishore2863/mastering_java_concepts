package TCSNQTPrepSession;

import java.util.Arrays;

//find the mini and max value in the given array
public class Program2 {
    public static void main(String[] args) {
        int[] arr ={100,50,150,25,75,125,115};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("min ="+arr[0]);
        System.out.println("max ="+arr[arr.length-1]);
    }

    static void bubble(int [] arr){
        for(int i=0; i< arr.length-2; i++){
            for(int j=i+1; j< arr.length-1; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
