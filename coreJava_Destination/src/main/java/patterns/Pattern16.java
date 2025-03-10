package patterns;

import java.util.Scanner;




public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size:");
        int size = sc.nextInt();
        for (int i=size; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}


//#####
//####
//###
//##
//#
