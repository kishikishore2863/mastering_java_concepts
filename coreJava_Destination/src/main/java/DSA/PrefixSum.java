package DSA;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int [] arr = {10,4,-8,7};
        System.out.println(Arrays.toString(arr));
        int [] prefixSum = new int[arr.length];
        prefixSum[0]= arr[0];
        for(int i=1; i<prefixSum.length; i++){
            prefixSum[i]=arr[i]+prefixSum[i-1];
        }
        System.out.println(Arrays.toString(prefixSum));

        int ans = 0;
        int n =  prefixSum.length;
        for (int i = 0; i < n - 1; i++) {
            long leftSection = prefixSum[i];
            long rightSection = prefixSum[n - 1] - prefixSum[i];
            if (leftSection >= rightSection) {
                ans++;
            }
        }
        System.out.println(ans);


    }




}
