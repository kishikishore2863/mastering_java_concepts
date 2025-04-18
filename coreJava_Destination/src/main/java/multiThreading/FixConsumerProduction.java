package multiThreading;

class Queue1{
    int i;
    boolean value_in = false;

   synchronized public void put(int i){

        this.i = i;
        System.out.println("I have produced the value"+i);
    }

    public void get(){
        System.out.println("I have Consume the value"+i);
    }
}

class Producer1 extends Thread{
    Queue1 a;

    public  Producer1(Queue1 a){
        this.a = a;
    }
    public void run(){
        int i=1;
        while (true){
            a.put(i++);
        }
    }


}

class Consumer1 extends Thread{
    Queue1 a;

    public  Consumer1(Queue1 a){
        this.a = a;
    }
    public void run(){
        while(true){
            a.get();
        }
    }

}



public class FixConsumerProduction {
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        Producer1 producer =new Producer1(q);
        Consumer1 consumer = new Consumer1(q);

        producer.start();
        consumer.start();
    }
}
