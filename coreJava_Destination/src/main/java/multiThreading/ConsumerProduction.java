package multiThreading;


class Queue{
    int i;

    public void put(int i){
        this.i = i;
        System.out.println("I have produced the value"+i);
    }

    public void get(){
        System.out.println("I have Consume the value"+i);
    }
}

class Producer extends Thread{
    Queue a;

    public  Producer(Queue a){
        this.a = a;
    }
    public void run(){
        int i=1;
        while (true){
            a.put(i++);
        }
    }


}

class Consumer extends Thread{
    Queue a;

    public  Consumer(Queue a){
        this.a = a;
    }
    public void run(){
        while(true){
            a.get();
        }
    }

}

public class ConsumerProduction {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer producer =new Producer(q);
        Consumer consumer = new Consumer(q);

        producer.start();
        consumer.start();
    }
}
