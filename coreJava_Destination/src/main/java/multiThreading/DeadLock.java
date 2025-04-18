package multiThreading;

class Warrior1 extends Thread{
    String res1="chicken Biriyani";
    String res2="peeper Chicken";
    String res3="Gobi manchurian";
    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("akash")){
            akashStarted();
        }
        else {
            kishoreStarted();
        }
    }

    private void akashStarted() {
        try{
            synchronized(res1) {
                System.out.println("akash started to eat " + res1);
                Thread.sleep(4000);
                synchronized(res2) {
                    System.out.println("akash started to eat " + res2);
                    Thread.sleep(4000);
                    synchronized(res3){
                        System.out.println("akash started to eat " + res3);
                        Thread.sleep(4000);
                    }
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void kishoreStarted() {
        try {
            synchronized(res3) {
                System.out.println("kishore started to eat " + res3);
                Thread.sleep(4000);
                synchronized(res2) {
                    System.out.println("kishore started to eat " + res2);
                    Thread.sleep(4000);
                    synchronized(res1) {
                        System.out.println("kishore started to eat " + res1);
                        Thread.sleep(4000);
                    }
                }
            }
        }
        catch(
                Exception e) {
            e.printStackTrace();
        }
    }
}

public class DeadLock{
    public static void main(String[] args){
        Warrior1 w1=new Warrior1();
        w1.setName("akash");
        Warrior1 w2=new Warrior1();
        w2.setName("kishore");
        w1.start();
        w2.start();
    }
}
