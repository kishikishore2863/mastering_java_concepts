package patterns;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int size = sc.nextInt();
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                System.out.print("# ");
            }
            for(int j=1; j<=size; j++){
                System.out.print("% ");
            }
            System.out.println();
        }
    }
}


//        # # # # # % % % % %
//        # # # # # % % % % %
//        # # # # # % % % % %
//        # # # # # % % % % %
//        # # # # # % % % % %
