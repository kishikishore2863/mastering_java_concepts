package alphabets;

import java.util.Scanner;

public class Alpha {
    static int n;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the size:");
         n =sc.nextInt();
        System.out.print("Enter the letters :");
        String inputLetters = sc.next().toUpperCase();
        System.out.println(inputLetters);
        char[] letters = inputLetters.toCharArray();
        printPattern(letters);
    }


    static void printPattern(char[] letters) {
        for (int i = 0; i < n; i++) {
            for (char letter : letters) {
                printRowOfLetter(letter, i);
                System.out.print("   ");
            }
            System.out.println();
        }
    }



    static void printRowOfLetter(char letter, int row) {
        switch (letter) {
            case 'A': a(row); break;
            case 'B': b(row); break;
            case 'C': c(row); break;
            case 'D': d(row); break;
            case 'E': e(row); break;
            case 'F': f(row); break;
            case 'G': g(row); break;
            case 'H': h(row); break;
            case 'I': i(row); break;
            case 'J': j(row); break;
            case 'K': k(row); break;
            case 'L': l(row); break;
            case 'M': m(row); break;
            case 'N': n(row); break;
            case 'O': o(row); break;
            case 'P': p(row); break;
            case 'Q': q(row); break;
            case 'R': r(row); break;
            case 'S': s(row); break;
            case 'T': t(row); break;
            case 'U': u(row); break;
            case 'V': v(row); break;
            case 'W': w(row); break;
            case 'X': x(row); break;
            case 'Y': y(row); break;
            case 'Z': z(row); break;
            default:
                System.out.print("Letter not supported");
        }
    }


    static void a(int i){
            for (int j=0; j<n; j++){
                if(i==0&&j!=0&&j!=n-1 || i==(n/2)|| j==0 && i!=0||j==(n-1) && i!=0){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

    }

    static void b(int i){
            for (int j=0; j<n; j++){
                if(j==0 || i==0&&j!=(n-1) || i==(n/2) && j!=(n-1) || i==(n-1)&&j!=(n-1) || j==(n-1)&& i!=0 && i!=(n/2) && i!=(n-1) ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

    }

    static void c(int i){
            for (int j=0; j<n; j++){
                if(i==0&&j!=0 || i==(n-1) && j!=0 || j==0 && i!=0 && i!=n-1 ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }

    static void d(int i){
            for (int j=0; j<n; j++){
                if(i==0&& j!=n-1 || j==0 || j==n-1 && i!=0 && i!=(n-1) || i==(n-1)&& j!=(n-1)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

    }

    static void e(int i){
            for (int j=0; j<n; j++){
                if(i==0&& j!=0 || j==0 && i!=0 && i!=(n-1)  || i==(n-1)&& j!=0 || i==(n/2) ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

    }

    static void f(int i){
            for (int j=0; j<n; j++){
                if(i==0&& j!=0 || j==0 && i!=0 && i!=(n-1)  || i==(n-1)&& j!=0 || i==(n/2) ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

    }

    static void g(int i){
            for (int j=0; j<n; j++){
                if(i ==0 && j!=0  || i==n-1 && j!=0 || i==(n/2) && j>=(n/2) || j==n-1 && i>=n/2 || j==0 && i!=0 && i!=n-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }

    static void h(int i){
            for (int j=0; j<n; j++){
                if(  i==(n/2)|| j==n-1  || j==0 ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }

    static void i(int i){
            for (int j=0; j<n; j++){
                if(  i==0 || i==n-1 || j==(n/2) ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }

    static void j(int i){
            for (int j=0; j<n; j++){
                if(  i==0 || i==n-1 && j<n/2 || j==(n/2)&& i!=n-1 ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }
    static void k(int i){
            for (int j=0; j<n; j++){
                if(  j==0 || i+j == n/2 || i-j == n/2 ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }





    static void l(int i){
        for (int j=0; j<n; j++){
            if(j==0  || i==n-1) {
                System.out.print("* ");
            }else {
                System.out.print("  ");
            }
        }

    }


    static void m(int i){
            for (int j=0; j<n; j++){
                if(j==0 || j==n-1 || (i==j && i<=n/2) || (j==n-i-1 && i<=n/2 && j>=n/2)) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

    }


    static void n(int i){
            for (int j=0; j<n; j++){
                if(  j==0 || j==n-1 || i==(j) ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }



    static void o(int i){
            for (int j=0; j<n; j++){
                if(i==0 && j!=0 && j!=n-1 || i==n-1 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 || j==n-1 && i!=0 && i!=n-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }


    static void p(int i){
            for (int j=0; j<n; j++){
                if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 || j==n-1 &&  i<(n/2) && i!=0 || i==(n/2) && j!=n-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

    }


    static void q(int i){
            for (int j=0; j<n; j++){
                if(i==0 && j!=0 && j!=n-1 || i==n-1 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 || j==n-1 && i!=0 && i!=n-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }

    static void r(int i){
            for (int j=0; j<n; j++){
                if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 || j==n-1 &&  i<(n/2) && i!=0 || i==(n/2) && j!=n-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }


    static void s(int i){
            for (int j=0; j<n; j++){
                if(i==0 && j!=0 && j!=n-1 || i==n-1 && j!=0 && j!=n-1 || j==0 && i<(n/2) && i!=0 || j==n-1 && i>=(n/2) && i!=n-1 && i!=n/2 || i==n/2 && j!=0 && j!=n-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

    }


    static void t(int i){
            for (int j=0; j<n; j++){
                if(  i==0  || j==(n/2) ) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }


    static void u(int i){
            for (int j=0; j<n; j++){
                if( i==n-1 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 || j==n-1 && i!=0 && i!=n-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }



    static void v(int i){
            for (int j=0; j<n; j++){
                if(j==i && j<n/2 || j==n-i-1 && j>=n/2) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
    }

    static void w(int i){
            for (int j=0; j<n; j++){
                if(j==0 || j==n-1 || (i>n/2 && (j==i || j==n-i-1))) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

    }





    static void x(int i){
            for (int j=0; j<n; j++){
                if(j==i || j==n-i-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

    }





    static void y(int i){
            for (int j=0; j<n; j++){
                if((j==i && i<n/2) || (j==n/2 && i>=n/2) || (j==n-i-1 && i<n/2)) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

    }







    static void z(int i){

            for (int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==n-i-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }

    }




}
