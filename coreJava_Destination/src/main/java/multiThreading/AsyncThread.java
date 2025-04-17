package multiThreading;




class Microsoft extends Thread{
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
                Thread.sleep(1000);
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public void checking(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println("Checking");
                Thread.sleep(1000);
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public void saving(){
        try{
            for(int i=1; i<=5; i++){
                System.out.println("saving");
                Thread.sleep(1000);
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
public class AsyncThread {
    public static void main(String[] args) {
        Microsoft ms1 = new Microsoft();
        ms1.setName("typing");
        Microsoft ms2 = new Microsoft();
        ms2.setName("checking");
        Microsoft ms3 = new Microsoft();
        ms3.setName("saving");

        ms1.start();
        ms2.start();
        ms3.start();
    }
}
