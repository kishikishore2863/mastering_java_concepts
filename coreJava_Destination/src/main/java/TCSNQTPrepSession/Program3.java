package TCSNQTPrepSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//WAP to check if the given array contains all the alphabets of english
public class Program3 {
    static int a=12;
    static {
        System.out.println("a from startic"+a);
    }
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("a from main"+a);
        Program3 p= new Program3();
        p.add();
    }
    public void add(){
        System.out.println(a);
    }



}
