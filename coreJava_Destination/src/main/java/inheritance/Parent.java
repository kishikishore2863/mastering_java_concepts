package inheritance;

public class Parent {
     String name;
     String city;
     int age;

    public Parent(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
}
class Child extends Parent{
    Child(String name, String city, int age){
        super(  name,city,age);
    }

}

class Launch{
    public static void main(String[] args) {
        Child c =new Child("name","city",90);
//        Child c1 =new Child();
    }
}