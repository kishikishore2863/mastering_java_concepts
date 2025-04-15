package multiThreading;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Operation11 implements Runnable{
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

class Operation22 implements Runnable{
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


class Operation33 implements Runnable{
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



public class MultiThreadingUsingRunnable {
    public static void main(String[] args) {
//        Operation11 op1 = new Operation11();
//        Thread thread1 = new Thread(op1);
//        thread1.start();
//        Operation22 op2 = new Operation22();
//        Thread thread2 = new Thread(op2);
//        thread2.start();
//        Operation33 op3 = new Operation33();
//        Thread thread3 = new Thread(op3);
//        thread3.start();

//        Map<String,Integer> map = new HashMap<>();
//        map.put("hello",2);
//        map.put("world",1);
//        System.out.println(map);



    }
}
