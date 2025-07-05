package patterns;

public class Rec {
    public static void main(String[] args) {
        int [] arr = {10,20,30};
        print(arr.length-1, arr);
    }

    public static void print(int n,int[] arr){
        if(n<0){
            return;
        }

        print(n-1,arr);
        System.out.println(arr[n]);
    }
}
