package TCSNQTPrepSession;

import java.util.Arrays;

//WAP to check if the given array contains all the alphabets of english
public class Program3 {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        char[] ch = s.toCharArray();

//        char[] ch = {'a','b','c','d','e','f','h','i','j','k','l','m,n,o,p,q,r,s,t,u,v,w,x,y,z};
        int [] alpha = new int[26];

        for(int i=0; i< alpha.length; i++){
            alpha[i]=0;
        }
        System.out.println(Arrays.toString(alpha));

        for(int i=0; i<ch.length; i++){
           int  temp = ch[i]-'a';
            alpha[temp] = 1;
        }

        System.out.println(Arrays.toString(alpha));

    }



}
