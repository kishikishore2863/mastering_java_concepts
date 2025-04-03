package DSA;

public class Recursion {
    public static void main(String[] args) {
        recursion(0);
    }

    public static void recursion(int k){
        if(k==10)return;
        System.out.println(k);
        recursion(k+1);

    }
}
