package TCSNQTPrepSession;

import java.util.Arrays;
import java.util.Scanner;

//WAP to check if the given 2 strings are anagram or not
public class Program5 {
    public static void main(String[] args) {
      boolean bol =  anagram("kishi","kings");
        System.out.println(bol);
    }

    static boolean anagram(String str1 , String str2){

        if (str1.length() != str2.length())return false;

        char[] ch1 = new char[str1.length()];
        char[] ch2 = new char[str2.length()];

        for(int i=0; i< ch1.length; i++){
            ch1[i] = str1.charAt(i);
            ch2[i] = str2.charAt(i);
        }
        System.out.println("========before sorting=======");
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));


        for(int i=0; i<ch1.length-1; i++){
            for(int j=i+1; j<ch1.length; j++){
                if(ch1[i]>ch1[j]){
                    char temp =ch1[i];
                    ch1[i]=ch1[j];
                    ch1[j] = temp;
                }
            }
        }
        for(int i=0; i<ch2.length-1; i++){
            for(int j=i+1; j<ch2.length; j++){
                if(ch2[i]>ch2[j]){
                    char temp =ch2[i];
                    ch2[i]=ch2[j];
                    ch2[j] = temp;
                }
            }
        }
        System.out.println("========After sorting=======");
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        int start =0;
        int end = ch1.length-1;

        while (start<end){
            if (ch1[start] !=ch2[start]){
                return false;
            }
            start++;
        }

        return true;
    }

}
