package Strings;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the String :");
        String str = sc.nextLine();
        int vowel = 0;
        int consonant = 0;
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e'||str.charAt(i) == 'i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u' ){
                    vowel++;
                }else consonant++;
            }
        }
        System.out.println("vowel"+vowel);
        System.out.println("consonant"+consonant);

    }
}
