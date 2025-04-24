package Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

 class Cricketer implements  Comparable<Cricketer>{
    String name;
    String country;
    int macthes;
    int runs;
    int wickets;


    public Cricketer(String name, String country, int macthes, int runs, int wickets) {
        this.name = name;
        this.country = country;
        this.macthes = macthes;
        this.runs = runs;
        this.wickets = wickets;
    }


    public String toString(){
        return  name+"---"+country+"----"+runs;
    }

    @Override
    public int compareTo(Cricketer o) {
        if(this.runs > o.runs){
            return 1;
        }else {
            return -1;
        }
    }
}

class MainApp{
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer("abd","south",200,1000,5);
        Cricketer c2 = new Cricketer("vk","south",200,8000,5);
        Cricketer c3 = new Cricketer("Sachin","south",200,89,5);

        ArrayList<Cricketer> list  = new ArrayList<Cricketer>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list);
    }
}
