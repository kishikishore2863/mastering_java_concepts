package Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer  {
    String name;
    int runs;

    Cricketer(String name, int runs){
        this.name = name;
        this.runs = runs;
    }

    @Override
    public String toString() {
        return name+"->"+runs;
    }
}

class Supporter implements Comparator<Cricketer> {

    @Override
    public int compare(Cricketer o1, Cricketer o2) {
        if(o1.runs>o2.runs){
            return 1;
        }else {
            return -1;
        }
    }
}

class Run{
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer("kishore",28);
        Cricketer c2 = new Cricketer("kishi",01);
        Cricketer c3 = new Cricketer("king",100);

        ArrayList<Cricketer> list =new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);

        Supporter s = new Supporter();
        Collections.sort(list,s);
        System.out.println(list);
    }
}
