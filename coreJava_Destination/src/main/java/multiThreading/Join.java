package multiThreading;

class Candidate1 extends  Thread{
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + "has enter to interview cabin");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " is  giving interview inside the cabin");
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName() + " has completed interview");
            Thread.sleep(9000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}



public class Join {
    public static void main(String[] args) throws Exception {
        Candidate1 candidate1 = new Candidate1();
        candidate1.setName("akash");
        Candidate1 candidate2 = new Candidate1();
        candidate2.setName("kishi");
        Candidate1 candidate3 = new Candidate1();
        candidate3.setName("jhonny");

        candidate1.start();
        candidate1.join();
        candidate2.start();
        candidate2.join();
        candidate3.start();
    }
}
