package constructor;

public class Dog {
    private String name;
    private String color;
    private String breed;
    private int age;
    private int cost;

    Dog(){
        this("jimmy");
        System.out.println("inside zero parameterized constructor");
        this.name = "Tommy";
        this.color = "red";
        this.breed = "breed";
        this.age = 2;
        this.cost = 9000;
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);
        System.out.println("--------------------");
    }
    Dog(String name){
        this("Bruno","brown");
        System.out.println("inside ");
        this.name = name;
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);
        System.out.println("--------------------");
    }
    Dog(String name,String color){
        this("Jipsy","white","GR");
        System.out.println("inside ");
        this.name = name;
        this.color =color;
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);
        System.out.println("--------------------");
    }

//    Dog(String name,String color,String breed){
//        this("Jipsy","white","GR");
//        System.out.println("inside ");
//        this.name = name;
//        this.color =color;
//        this.breed = breed;
//        System.out.println(this.name);
//        System.out.println(this.color);
//        System.out.println(this.breed);
//        System.out.println(this.age);
//        System.out.println(this.cost);
//        System.out.println("--------------------");
//    }

    Dog(String name,String color,String breed){
        this("chintu","purple","sitze",7);
        System.out.println("inside ");
        this.name = name;
        this.color =color;
        this.breed = breed;
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);
        System.out.println("--------------------");
    }

    Dog(String name,String color,String breed,int age){
        this("chintu","purple","sitze",7,8000);
        System.out.println("inside ");
        this.name = name;
        this.color =color;
        this.breed = breed;
        this.age = age;
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);
        System.out.println("--------------------");
    }

    Dog(String name,String color,String breed,int age,int cost){
        super();
        System.out.println("inside ");
        this.name = name;
        this.color =color;
        this.breed = breed;
        this.age = age;
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);
        System.out.println("--------------------");
    }

}

class Call{
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
