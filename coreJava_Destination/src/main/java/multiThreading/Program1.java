package multiThreading;

public class Program1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        Thread t1 = new Thread();
        System.out.println(t1);
        t1.setName("k");
        t1.setPriority(8);
        System.out.println(t1);
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
    }
}
