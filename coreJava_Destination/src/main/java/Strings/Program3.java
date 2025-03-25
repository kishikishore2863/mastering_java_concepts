package Strings;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the String :");
        String str = sc.nextLine();
        int small_vowel = 0;
        int capital_vowel = 0;
        int consonant = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    small_vowel++;
                } else if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                    capital_vowel++;
                } else consonant++;
            }
        }
        System.out.println("vowel" + small_vowel);
        System.out.println("vowel" + capital_vowel);
        System.out.println("consonant" + consonant);
    }
}
