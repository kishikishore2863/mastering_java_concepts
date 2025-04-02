package DSA;

public class Rage_Sum_query_303 {
    public static void main(String[] args) {
        int n = 153;
        int n1 = n;
        int clone =n;
        int count =0;
        while(n>0){
            count++;
           n=n/10;
        }
        int sum =0;
        while(n1>0){
            int lastDigit = n1%10;
            sum =sum +(int)(Math.pow(lastDigit,count));
            n1=n1/10;
        }
        if(sum == clone){
            System.out.println("is a amstrong");
        }else{
            System.out.println("is not amstrong");
        }

    }


}

//class NumArray {
//
////    int [][] nums = {{{-2,0,3,-5,2,-1}},{0,2},{2,5},{0,5}};
//
//    public NumArray(int[] nums) {
//
//    }
//
//    public int sumRange(int left, int right) {
//
//    }
//}