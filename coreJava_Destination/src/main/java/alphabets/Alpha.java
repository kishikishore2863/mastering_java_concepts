package alphabets;

import java.util.Scanner;

public class Alpha {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.print("enter the size:");
//        int n =sc.nextInt();
//        a(n);
//        b(n);
//        c(11);
//        d(11);
//        e(11);
//        f(11);
//        g(11);
//        h(11);
//        i(11);
//        j(11);
//        k(11);
//        l(11);
        m(11);
    }

    static void a(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==0&&j!=0&&j!=n-1 || i==(n/2)|| j==0 && i!=0||j==(n-1) && i!=0){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void b(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(j==0 || i==0&&j!=(n-1) || i==(n/2) && j!=(n-1) || i==(n-1)&&j!=(n-1) || j==(n-1)&& i!=0 && i!=(n/2) && i!=(n-1) ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void c(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==0&&j!=0 || i==(n-1) && j!=0 || j==0 && i!=0 && i!=n-1 ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void d(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==0&& j!=n-1 || j==0 || j==n-1 && i!=0 && i!=(n-1) || i==(n-1)&& j!=(n-1)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void e(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==0&& j!=0 || j==0 && i!=0 && i!=(n-1)  || i==(n-1)&& j!=0 || i==(n/2) ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void f(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==0&& j!=0 || j==0 && i!=0 && i!=(n-1)  || i==(n-1)&& j!=0 || i==(n/2) ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void g(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i ==0 && j!=0  || i==n-1 && j!=0 || i==(n/2) && j>=(n/2) || j==n-1 && i>=n/2 || j==0 && i!=0 && i!=n-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void h(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(  i==(n/2)|| j==n-1  || j==0 ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void i(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(  i==0 || i==n-1 || j==(n/2) ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void j(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(  i==0 || i==n-1 && j<n/2 || j==(n/2)&& i!=n-1 ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void k(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(  j==0 || i+j == n/2 || i-j == n/2 ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    static void m(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(  j==0 || j==n-1 || i==(j) ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }




}
