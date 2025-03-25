package Strings;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Program4 p = new Program4();
        System.out.println(p.toLowerCase1("KISHI kishi"));
        System.out.println(p.toUpperCase1("kish"));

    }


    public  String toUpperCase1(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122 ){
                char temp=(char) ((int)str.charAt(i)-32);
                sb.setCharAt(i,temp);
            }
        }
        return sb.toString();
    }

    public  String toLowerCase1(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90 ){
                char temp=(char) ((int)str.charAt(i)+32);
                sb.setCharAt(i,temp);
            }
        }
        return sb.toString();
    }
}
