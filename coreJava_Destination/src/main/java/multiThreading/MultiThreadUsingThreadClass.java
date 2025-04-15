package multiThreading;


import java.util.Scanner;

class Operation1 extends Thread{
    Scanner sc = new Scanner(System.in);

    public void run() {
        System.out.println("Addition operation started");
        System.out.println("enter num1");
        int n1 = sc.nextInt();
        System.out.println("enter num2");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println(sum);
        System.out.println("addition operation completed");
    }
}

class Operation2 extends Thread{
    Scanner sc = new Scanner(System.in);

    public void run(){
        System.out.println("printing operation");
        for(int i=0; i<=5 ;i++){
            System.out.println("hi from print");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("printing operation completed");
    }
}


class Operation3 extends Thread{
    Scanner sc = new Scanner(System.in);

    public void run() {
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

public class MultiThreadUsingThreadClass {
    public static void main(String[] args) {
        Operation1 op1 = new Operation1();
        op1.setName("add");
        Operation2 op2 = new Operation2();
        op2.setName("print");
        Operation3 op3 = new Operation3();
        op3.setName("bank");

        op1.run();
        op2.start();
        op3.start();



    }
}
