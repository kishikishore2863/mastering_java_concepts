package alphabets;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix2sum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of the matrix");
        int n = sc.nextInt();
        int [][] arr1 = new int[n][n];
        int [][] arr2 = new int[n][n];
        int [][] arr3 =new int[n][n];

        for(int i=0; i<=n-1; i++){
        for(int j=0; j<=n-1; j++){
            System.out.println("enter the values of arr1["+i+"]"+"["+j+"]");
            int value=sc.nextInt();
            arr1[i][j]=value;
        }

        }

        for(int i=0; i<=n-1; i++){
            for(int j=0; j<=n-1; j++){
                System.out.println("enter the values of arr2["+i+"]"+"["+j+"]");
                int valuse=sc.nextInt();
                arr2[i][j]=valuse;
            }

        }

        for(int i=0; i<=n-1; i++){
            for (int j=0; j<=n-1; j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j] +" ");
            }
            System.out.println();
        }











//        int[][] scores ={{1,2},{3,4}};
//
//        int[][] scores2 = {{1,2},{3,4}};
//
//        int[][] scores3 = new int[2][2];
//
//        for(int i=0; i<=2-1; i++){
//            for (int j=0; j<=2-1; j++){
//                scores3[i][j]=scores[i][j]+scores2[i][j];
//                System.out.print(scores3[i][j] +" ");
//            }
//            System.out.println();
//        }

    }
}
