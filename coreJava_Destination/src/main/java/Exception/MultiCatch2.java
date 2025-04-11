package Exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch2 {
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
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("input given is mis-matched or arithmetic operation ");
        }
        catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e){
            System.out.println("Array size cannot be negative or given pos value is beyond the range");
        }
        catch (Exception e){
            System.out.println(" exception handled");
        }
    }
}

