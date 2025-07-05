package plymorphism;

 class Employee {
   static void add(int a ,int b){
        System.out.println(a+b);
    }

   static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

}

public class MethodOverloading{
    public static void main(String[] args) {
        Employee.add(1,2);
        Employee.add(1,2,3);
    }


}

