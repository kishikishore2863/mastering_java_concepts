package patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        for(int i=1; i<=size; i++){
            int k=i;
            for (int j=1; j<=size; j++){
                System.out.print(k+" ");
                k=k+5;
            }
            System.out.println();
        }
    }
}


//        1 6 11 16 21
//        2 7 12 17 22
//        3 8 13 18 23
//        4 9 14 19 24
//        5 10 15 20 25
