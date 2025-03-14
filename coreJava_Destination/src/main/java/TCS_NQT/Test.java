package TCS_NQT;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int copy = 12521;
        int n = copy;
        int reversed=0;

       while (n>0){
           int digit = n%10;
           reversed =reversed*10+digit;
           n=n/10;
       }
       if(n == reversed){
           System.out.println("palindrom");
       }else {
           System.out.println("not");
       }

    }
}
