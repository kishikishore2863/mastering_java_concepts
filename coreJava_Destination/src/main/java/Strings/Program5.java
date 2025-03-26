package Strings;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = sc.next();
        int start = 0;
        int end = str.length();
        int sum = 0;
        while(start<end){
            if(str.charAt(start)>='a' && str.charAt(start)>='z' || str.charAt(start)>='A' && str.charAt(start)>='Z'){
                if(str.charAt(start) == 'A'|| str.charAt(start) == 'E' || str.charAt(start) == 'I' || str.charAt(start) == 'O'|| str.charAt(start) == 'U'
                        ||str.charAt(start) == 'a'|| str.charAt(start) == 'e' || str.charAt(start) == 'i' || str.charAt(start) == 'o'|| str.charAt(start) == 'u'
                ){
                    sum = sum+str.charAt(start);
                }
            }
        }
        System.out.println(sum);
    }
}
