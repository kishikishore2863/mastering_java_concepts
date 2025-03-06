package BasicOFProgramming;

import java.awt.image.SampleModel;

public class StaticExample {
    public static void main(String[] args) {
        SampleCode.display();
        System.out.println("-------------");
        SampleCode.var1=1;
        SampleCode.var2=2;
        SampleCode.var3=3;
        System.out.println(SampleCode.var1);
        System.out.println(SampleCode.var2);
        System.out.println(SampleCode.var3);
        System.out.println("---------------");
        SampleCode sc = new SampleCode();
        sc.display1();
    }

}

class SampleCode{
    static int var1,var2,var3;
    int nvar1,nvar2,nvar3;

    static {
        var1 = 100;//static variables can be accessed inside the static block
        var2 = 200;
        var3 = 400;
//        nvar1 = 111; //non-static variables cannot be accessed inside the static block
//        nvar1 = 222; //non-static variables cannot be accessed inside the static block
//        nvar1 = 333; //non-static variables cannot be accessed inside the static block
    }

    {
        var1 =2000;//static variables can be accesed inside the non-static block
        var2 =3000;//static variables can be accesed inside the non-static block
        var3 =4000;//static variables can be accesed inside the non-static block
        nvar1=999;//non-static variables can be accessed inside the non-static block
        nvar2=888;//non-static variables can be accessed inside the non-static block
        nvar3=777;//non-static variables can be accessed inside the non-static block
    }

    static void display(){
        System.out.println(var1); //ststic variable can be accessed inside the non-static method
        System.out.println(var2);
        System.out.println(var3);
//        System.out.println(navar1);//non-static vairables can be accessed inside the non-static method
//        System.out.println(navar2);//non-static vairables can be accessed inside the non-static method
//        System.out.println(navar3);//non-static vairables can be accessed inside the non-static method
    }

    void display1(){
        System.out.println(var1); //static variable can be accessed the non-static method
        System.out.println(var2); //static variable can be accessed the non-static method
        System.out.println(var3); //static variable can be accessed the non-static method
        System.out.println((nvar1));//non-static variable can be accessed inside the non-static method
        System.out.println((nvar2));//non-static variable can be accessed inside the non-static method
        System.out.println((nvar3));//non-static variable can be accessed inside the non-static method

    }


}
