package multiThreading;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition operation started");
        System.out.println("enter num1");
        int n1 = sc.nextInt();
        System.out.println("enter num2");
        int n2 = sc.nextInt();
        int sum = n1+n2;
        System.out.println(sum);
        System.out.println("addition operation completed");
        System.out.println("printing operation");
        for(int i=0; i<=5 ;i++){
            System.out.println("hi from print");
            Thread.sleep(4000);
        }
        System.out.println("printing operation completed");
        System.out.println("Banking operation");
        System.out.println("enter username");
        String user = sc.next();
        System.out.println("enter pin:");
        int pin = sc.nextInt();
        if(user.equals("xyz")&&pin==1234){
            System.out.println("user verified");
        }else{
            System.out.println("Invalid user");
        }
        System.out.println("banking operation completed");
    }
}
