package alphabets;

public class EvenOdd {
    public static void main(String[] args) {
        int [] arr = {1,2,35,34,57,63,7};
        int even=0;
        int odd=0;
        for (int i=0; i<=arr.length-1; i++){
            if(arr[i]%2==0){
               even++;
            }else {
                odd++;
            }
        }
        System.out.println("even number is"+even);
        System.out.println("odd number is"+odd);
    }
}
