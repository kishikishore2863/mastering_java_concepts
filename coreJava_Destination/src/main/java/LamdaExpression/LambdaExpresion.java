package LamdaExpression;



interface Cal{
    void add();
}


interface Cal2{
    void add();
    void sum();
}


public class LambdaExpresion {
    public static void main(String[] args) {
       Cal c = ()->{
           System.out.println("inside add method");
        };

//       Cal2 c1 =()->{
//
//       }
    }
}


interface CalforConst{
    int a=290;
    int b=390;
    int add();
}
 class LambdaExpresionwithIntefaceConst{
    public static void main(String[] args) {
       CalforConst c =()->{
         return CalforConst.a+CalforConst.b;
       };

        System.out.println(c.add());

    }
}
