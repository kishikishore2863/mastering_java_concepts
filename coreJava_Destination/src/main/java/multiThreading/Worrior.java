package multiThreading;

public class Worrior extends Thread{

    String re1 = "Ak47";
    String re2 = "Insus";
    String re3 = "Rifel";


    public void run(){
        if(Thread.currentThread().getName().equals("jaguar")){
            jaguarFights();
        }else{
            rockyFight();
        }
    }

   private void jaguarFights(){
        try{
            synchronized (re1){
                System.out.println("jaguar stated to fight with"+re1);
                Thread.sleep(4000);
                synchronized ((re2)){
                    System.out.println("jaguar stated to fight with"+re2);
                    Thread.sleep(4000);
                    synchronized (re3){
                        System.out.println("jaguar stated to fight with"+re3);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
   }

    private void rockyFight(){
        try{
            synchronized (re1){
                System.out.println("rocky stated to fight with"+re1);
                Thread.sleep(4000);
                synchronized ((re2)){
                    System.out.println("rocky stated to fight with"+re2);
                    Thread.sleep(4000);
                    synchronized (re3){
                        System.out.println("rocky stated to fight with"+re3);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


class Launcher{
    public static void main(String[] args) {
        Worrior worrior1 = new Worrior();
        worrior1.setName("akash");
        Worrior worrior2 = new Worrior();
        worrior2.setName("kishore");

        worrior1.start();
        worrior2.start();
    }
}
