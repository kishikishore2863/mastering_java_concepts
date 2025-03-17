package Arrays;

import java.util.Arrays;

public class AlphabetCheck {
    public static void main(String[] args) {
        char[] arr ={'a','s','d','f','g','h','j','k','l','z','c','b','n','m','q','w','e','r','t','y','u','i','o','p','x','v'};
//        char[] arr ={'a','b','c','d'};
        int[] res =new int[26];

        for ( int i=0; i<res.length; i++){
            res[i] = 0;
        }
        int start =97;
        for(int i=0 ; i< res.length; i++){
            for(int j=0; j<arr.length; j++){
                if(start+i==arr[j]){
                    res[i]=1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        for (int i=0; i< res.length; i++){
            if(res[i]==0) {
                System.out.println("not pangram");
                System.exit(0);
            }
        }
        System.out.println("pangram");

    }
}
