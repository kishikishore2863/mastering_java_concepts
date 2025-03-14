package alphabets;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the matrix (n x n):");
        int n = sc.nextInt();

        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        int[][] arr3 = new int[n][n];

        System.out.println("Enter values for the first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr1[" + i + "][" + j + "]: ");
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values for the second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr2[" + i + "][" + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Res:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
