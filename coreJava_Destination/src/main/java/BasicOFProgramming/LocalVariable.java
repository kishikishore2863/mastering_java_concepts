package BasicOFProgramming;



class Calculator{
    void add(){
      int a;
      a=10;
      int b =20;
      int c = a+b;
        System.out.println(c);
    }
    void sub(int a, int b){
        System.out.println(a-b);
    }
}
public class LocalVariable {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add();
        cal.sub(10,5);
    }
}

