package patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        for(int i=1; i<=size; i++){
            for(int j=size; j>=i; j--){
                System.out.print("-");
            }
            for(int k=1; k<=size; k++){
                System.out.print("#");
            }
            System.out.println();

        }
    }
}


//        -----#####
//        ----#####
//        ---#####
//        --#####
//        -#####
