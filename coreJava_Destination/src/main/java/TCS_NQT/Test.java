package TCS_NQT;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

//      boolean bool =  isSubsequence("ace","abcde");
//        System.out.println(bool);
        int[] arr1={1,4,7,20};
        int[] arr2={3,5,6};

       int[] result=  joining(arr1,arr2);

    }

//    public static boolean isSubsequence(String s, String t) {
//        int i=0;
//        int j=0;
//
//
//        while(i<s.length() && j<t.length()){
//            if(s.charAt(i) == t.charAt(j)){
//                i++;
//            }
//            j++;
//        }
//        System.out.println(i);
//        System.out.println(s.length());
//        return i == s.length();
//
//    }

    public static int[] joining(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length  ){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                k++;
                i++;
            }else {
                res[k]=arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            res[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            res[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(res));
        return res;
    }
}
