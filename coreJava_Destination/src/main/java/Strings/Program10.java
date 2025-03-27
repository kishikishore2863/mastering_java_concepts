package Strings;

import java.util.Arrays;

public class Program10 {
    public static void main(String[] args) {
       String res =  anagram("pot","top");
        System.out.println(res);
    }

    public static String anagram(String s1 , String s2){
        if(s1.length() != s2.length())return "not anagram";

        char [] arr = new char[s1.length()];
        char [] arr2 = new char[s1.length()];

        for(int i=0; i<s1.length(); i++){
            arr[i] = s1.charAt(i);
            arr2[i] = s2.charAt(i);
        }

        arr =sort(arr);
        arr2=sort(arr2);

        for(int i=0; i< arr.length; i++){
            if(arr[i] != arr2[i])return "not anagram";
        }
        return "anagram";
    }

    public static char[] sort(char[] arr){
        for(int i=0; i< arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return  arr;
    }

}
