package BasicOFProgramming;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of int ");
        int i = sc.nextInt();
        System.out.println("the entered value is :"+i);

        System.out.println("enter the value of String");
        String str = sc.next();
        System.out.println("the entered value is :"+str);

        System.out.println("enter the value of byte ");
        byte byt = sc.nextByte();
        System.out.println("the entered value is :"+byt);

        System.out.println("enter the value of boolean ");
        boolean bol = sc.nextBoolean();
        System.out.println("the entered value is :"+bol);

        System.out.println("enter the  short");
        short st =sc.nextShort();
        System.out.println("the entered value is :"+st);

        System.out.println("enter the long");
        long lg = sc.nextLong();
        System.out.println("the entered value is :"+lg);

        System.out.println("enter the value float");
        float ft = sc.nextFloat();
        System.out.println("the entered value is :"+ft);

        System.out.println("enter the value double");
        double db = sc.nextDouble();
        System.out.println("the entered value is :"+db);
    }
}
