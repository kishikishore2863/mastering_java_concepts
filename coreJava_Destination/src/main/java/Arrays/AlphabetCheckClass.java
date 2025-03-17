package Arrays;

import java.util.Arrays;

public class AlphabetCheckClass {
    public static void main(String[] args) {
        char[] arr ={'a','s','d','f','g','j','k','l','z','c','b','n','m','q','w','e','r','t','y','u','i','o','p','x','v'};
        int[] res =new int[26];

        for ( int i=0; i<res.length; i++){
            res[i] = 0;
        }

        int temp =0;

        for(int i=0; i< arr.length; i++){
            temp = arr[i]-'a';
            res[temp] =1;
        }

        System.out.println(Arrays.toString(res));

        for (int i=0; i< res.length; i++){
            if(res[i]!=2){
                System.out.println("it is not a pangram array");
                System.exit(0);
            }
        }
        System.out.println("it is a pangram array");


    }

}
