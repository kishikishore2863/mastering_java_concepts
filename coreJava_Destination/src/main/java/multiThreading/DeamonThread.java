package multiThreading;


class Microsoft1 extends Thread{
    public void run(){
        if(Thread.currentThread().getName().equals("typing")){
            typing();
        } else if (Thread.currentThread().getName().equals("checking")) {
            checking();
        }else saving();
    }

    public void typing(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println("typing");
//                Thread.sleep(0);
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public void checking(){
        try{
            for(;;){
                System.out.println("Checking");
                Thread.sleep(2000);
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public void saving(){
        try{
            for(;;){
                System.out.println("saving");
                Thread.sleep(2000);
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
public class DeamonThread {
    public static void main(String[] args) {
        Microsoft1 ms1 = new Microsoft1();
        ms1.setName("typing");
        Microsoft1 ms2 = new Microsoft1();
        ms2.setName("checking");
        Microsoft1 ms3 = new Microsoft1();
        ms3.setName("saving");

        ms2.setDaemon(true);
        ms3.setDaemon(true);

        ms2.setPriority(8);
        ms3.setPriority(9);

        ms1.start();
        ms2.start();
        ms3.start();
    }

}
