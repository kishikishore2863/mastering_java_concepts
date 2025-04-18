package multiThreading;

 class Candidate extends  Thread{
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

class Launch{
    public static void main(String[] args) {
        Candidate candidate1 = new Candidate();
        candidate1.setName("akash");
        Candidate candidate2 = new Candidate();
        candidate2.setName("kishi");
        Candidate candidate3 = new Candidate();
        candidate3.setName("jhonny");

        candidate1.start();
        candidate2.start();
        candidate3.start();
    }
}
