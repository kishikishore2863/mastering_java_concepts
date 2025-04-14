package Exception;

import java.sql.SQLOutput;
import java.util.Scanner;

class Operation1{
    void function1() throws Exception{
        System.out.println("Inside func 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1");
        int num1 = sc.nextInt();
        System.out.println("enter num 2");
        int num2 = sc.nextInt();
        int res = num1/num2;
        System.out.println(res);
        System.out.println("left function1");
    }
}
//class Operation2{
//    void function2() {
//        Operation1 op1 = new Operation1();
//        try {
//            op1.function1();
//            System.out.println("left function2");
//        } catch (Exception e) {
//            System.out.println("Exception caught in function1: " + e.getMessage());
//        }
//    }
//}

class Operation2{
    void function2() throws Exception {
        Operation1 op1 = new Operation1();
            op1.function1();
            System.out.println("left function2");
    }
}

//class Operation3{
//    void function3(){
//        Operation2 op2 = new Operation2();
//        try {
//            op2.function2();
//            System.out.println("left function3");
//        }catch (Exception e){
//            System.out.println("Exception caught in function2: "+e.getMessage());
//        }
//
//    }
//}

class Operation3{
    void function3() throws Exception{
        Operation2 op2 = new Operation2();
        op2.function2();
        System.out.println("left function3");
    }
}

//class Operation4{
//    void function4(){
//        Operation3 op3 = new Operation3();
//        try {
//            op3.function3();
//            System.out.println("left function4");
//        }catch ( Exception e){
//            System.out.println("Exception caught in function3: "+e.getMessage());
//        }
//    }
//}
//

class Operation4{
    void function4() throws Exception{
        Operation3 op3 = new Operation3();
            op3.function3();
            System.out.println("left function4");
    }
}

public class OperationStart {
    public static void main(String[] args) throws Exception {
        Operation4 op4 = new Operation4();
        op4.function4();
    }
}
