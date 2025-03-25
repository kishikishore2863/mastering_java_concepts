package DSA;

public class Leetcode {
    public static void main(String[] args) {
    f1(1);
        System.out.println(fibnnoci(10));
    }

    public static void f1(int i){
        if(i>10)return;
        System.out.println(i);
        f1(i+1);
        System.out.println("call ends of :"+i);
        return;
    }

    public static int fibnnoci(int  n){
        if(n<=1)return n;
        System.out.println(n);
        return fibnnoci(n-1)+fibnnoci(n-2);
    }
}
