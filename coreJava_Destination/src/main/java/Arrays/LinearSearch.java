package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,43, 12,7,56,89,44,22,39};
        linear(arr,23);
    }

    public static boolean  linear(int [] arr,int target){
        for(int i=0; i< arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false ;
    }
}
