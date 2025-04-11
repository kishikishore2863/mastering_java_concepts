package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Division operator is initated");
            System.out.println("enter num1");
            int n1 = sc.nextInt();//critical statement
            System.out.println("enter num2");
            int n2 = sc.nextInt();//critical statement
            int res = n1 / n2;//critical statement
            System.out.println(res);
            System.out.println("division completed");
            System.out.println("Array operator initiated");
            System.out.println("enter array size");
            int size = sc.nextInt();//critical statement
            int[] arr = new int[size];//critical statement
            System.out.println("enter the position to add data");
            System.out.println("enter the position ");
            int pos = sc.nextInt();//critical statement
            System.out.println("enter the data");
            int val = sc.nextInt();//critical statement
            arr[pos] = val;//critical statement
            System.out.println("data added");
            System.out.println("array operation completed");
        } catch (InputMismatchException e) {
            System.out.println("input need to be int");
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException is genarated");
        }
        catch (NegativeArraySizeException e){
            System.out.println("Array size is negative");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("please specify the pos within the array");
        }
        catch (Exception e){
            System.out.println("generic exception");
        }
    }
}
