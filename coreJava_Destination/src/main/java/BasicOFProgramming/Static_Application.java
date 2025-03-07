package BasicOFProgramming;

import java.util.Scanner;

public class Static_Application {
    public static void main(String[] args) {
        Former f1 = new Former();
        f1.collectionData();
        f1.calculate();
        f1.display();
        Former f2 = new Former();
        f2.collectionData();
        f2.calculate();
        f2.display();
        Former f3 = new Former();
        f3.collectionData();
        f3.calculate();
        f3.display();
    }
}

class Former{
    double principle;
    static double rate=7.97;
    double time;
    double si;

//    static{
//        rate = 7.897;
//    }

    void collectionData(){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the principle:");
        principle =sc.nextDouble();
        System.out.print("enter the time:");
        time = sc.nextDouble();
    }

    void calculate(){
        si = (principle*time*rate)/100;
    }

    void display(){
        System.out.println("the si ="+si);

    }

}
