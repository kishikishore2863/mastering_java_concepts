package Strings;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String str = sc.nextLine();
        long prod = 1;
        for(int i=0; i<str.length(); i++) {
            if (i % 2 == 0) {
                if (str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U'
                        && str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                    prod = prod * str.charAt(i);
                    System.out.println("consider:" + str.charAt(i));
                }

            }
        }
        System.out.println(prod);
    }
}
