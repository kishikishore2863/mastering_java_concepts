package BasicOFProgramming;

import java.util.Scanner;

public class IdentifiersExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        int res = num1+num2;
        System.out.println(res);
    }
}
