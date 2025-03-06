package BasicOFProgramming;

import java.util.Scanner;

public class InstanceVariableExample {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.display();
        d1.allocationData();
        d1.display();


    }

}


class Dog{
    String name;
    String color;
    String breed;

    int age;
    int cost;



    public void   allocationData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the dog:");
        name = sc.next();
        System.out.print("Enter the color of the dog:");
        color = sc.next();
        System.out.print("Enter the breed of the dog:");
        breed = sc.next();
        System.out.print("Enter the age of the dog:");
        age = sc.nextInt();
        System.out.print("Enter the cost of the dog:");
        cost = sc.nextInt();

    }


    public void display(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(breed);
        System.out.println(age);
        System.out.println(cost
        );
    }

}



//class Car{
//    String brand;
//    String model;
//
//    public Car(String brand,String model){
//        this.brand= brand;
//        this.model = model;
//    }
//}