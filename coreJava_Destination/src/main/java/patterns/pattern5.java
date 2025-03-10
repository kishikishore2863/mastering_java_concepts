package patterns;

import java.util.Scanner;
//1  2  3  4  5
//6  7  8  9  10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size :");
        int size = sc.nextInt();
        int count = 1;
        for(int i=1; i<=size; i++){
            for (int j=1; j<=size; j++){
                int digit =0;
                int clone =count;
                while(clone>0){
                    clone=clone/10;
                    digit++;
                }
                if(digit==1){
                    System.out.print(count+"  ");
                }else {
                    System.out.print(count+" ");
                }

                count++;
            }
            System.out.println();
        }

    }
}



//        1  2  3  4  5
//        6  7  8  9  10
//        11 12 13 14 15
//        16 17 18 19 20
//        21 22 23 24 25