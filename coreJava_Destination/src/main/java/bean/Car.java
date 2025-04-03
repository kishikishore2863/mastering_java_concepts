package bean;

public class Car {
    private  String color;
    private int number;
    private String brand;


    public Car(String color, int number, String brand) {
        this.color = color;
        this.number = number;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}


class Company{
    public static void main(String[] args) {
       Car bmw1 = new Car("White",6576,"bmw");
        System.out.println(bmw1.getColor());
       Car bmw2 = new Car("black",6576,"bmw");
        System.out.println(bmw2.getColor());

    }
}
