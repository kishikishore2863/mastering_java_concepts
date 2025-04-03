package inheritance;

public class Animal {
    String name;
    String breed;
    String color;
    int age;

    public Animal(){
        System.out.println("Inside zero parameterized constructor");
        this.name="elephant";
        this.breed = "indian";
        this.color = "white";
        this.age = 18;
    }

    public Animal(String name, String breed, String color, int age){
        super();
        System.out.println("inside parameter constructor");
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }



}

