package TCSNQTPrepSession;


import java.util.Arrays;

//write a program to reverse a given arr and find the mini and max value in the given array
public class Program1 {
    public static void main(String[] args) {
        int arr[] ={100,50,150,25,75,125,115};
        System.out.println(Arrays.toString(arr));

        int start=0;
        int end= arr.length-1;

        while(start<end){
            int temp =arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
