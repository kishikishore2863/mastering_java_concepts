package BasicOFProgramming;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("enter second number: ");
        int num2 = sc.nextInt();
        int res1 = num1+num2;
        System.out.println("Addition result is:"+res1);
        System.out.println("=========================");
        int res2 = num1-num2;
        System.out.println("Substraction  result is:"+res2);
        System.out.println("=========================");
        int res3 = num1*num2;
        System.out.println("multiplication  result is:"+res3);
        System.out.println("=========================");
        int res4= num1/num2;
        System.out.println("division  result is:"+res4);
        System.out.println("=========================");
        int res5 = num1+num2;
        System.out.println("modulus  result is:"+res5);
        System.out.println("=========================");
    }
}
