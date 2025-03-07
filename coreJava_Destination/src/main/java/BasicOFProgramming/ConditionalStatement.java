package BasicOFProgramming;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 =sc.nextInt();
        System.out.println("enter the second number:");
        int num2 =sc.nextInt();

        if(num1>num2){
            System.out.println("num1 is greater");
        }else{
            System.out.println("num2 is greater");
        }

        System.out.println("========================");
        System.out.println("enter age:");
        int age = sc.nextInt();
        if(age >18){
            System.out.println("eligible");
        }else if(age==18){
            System.out.println("eqaul");
        }else {
            System.out.println("not eligible");
        }
    }
}
