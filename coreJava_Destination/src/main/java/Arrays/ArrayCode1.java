package Arrays;

import java.util.Scanner;

public class ArrayCode1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of an array:");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<arr.length; i++){
            System.out.println("enter the marks of student no: "+(i+1));
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length; i++){
            System.out.println("enter the marks of student no: "+(i+1)+"is = "+arr[i]);
        }

    }

}
