package interface1;

import java.util.Scanner;

public interface Calculator {
    void addition();
    void div();
    void multiplication();
}

interface Abacus {
    void mind();
    void think();
}

interface Scientific extends Calculator {
    void power();
    void expo();
}

class Cal1 implements Calculator {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addition() {
        System.out.print("Cal1 - Enter two numbers for addition: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Cal1 Addition Result: " + (a + b));
    }

    @Override
    public void div() {
        System.out.print("Cal1 - Enter two numbers for division: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b != 0) {
            System.out.println("Cal1 Division Result: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    @Override
    public void multiplication() {
        System.out.print("Cal1 - Enter two numbers for multiplication: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Cal1 Multiplication Result: " + (a * b));
    }
}

class launch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator c = new Calculator() {
            @Override
            public void addition() {
                System.out.print("Anonymous - Enter two numbers for addition: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("Anonymous Addition Result: " + (a + b));
            }

            @Override
            public void div() {
                System.out.print("Anonymous - Enter two numbers for division: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (b != 0) {
                    System.out.println("Anonymous Division Result: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            }

            @Override
            public void multiplication() {
                System.out.print("Anonymous - Enter two numbers for multiplication: ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("Anonymous Multiplication Result: " + (a * b));
            }
        };

        c.addition();
        c.div();
        c.multiplication();
    }
}

class Mathematician implements Calculator, Abacus {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addition() {
        System.out.print("Enter two numbers for addition: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = a + b;
        System.out.println("Mathematician addition: " + result);
    }

    @Override
    public void div() {
        System.out.print("Enter two numbers for division: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b != 0) {
            int result = a / b;
            System.out.println("Mathematician division: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    @Override
    public void multiplication() {
        System.out.print("Enter two numbers for multiplication: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = a * b;
        System.out.println("Mathematician multiplication: " + result);
    }

    @Override
    public void mind() {
        System.out.println("Mathematician is using mental calculation skills.");
    }

    @Override
    public void think() {
        System.out.println("Mathematician is thinking about complex problems.");
    }
}

class OriginalCalculator implements Calculator {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void addition() {
        System.out.print("OriginalCalculator - Enter two numbers for addition: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Result: " + (a + b));
    }

    @Override
    public void div() {
        System.out.print("OriginalCalculator - Enter two numbers for division: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b != 0) {
            System.out.println("Result: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    @Override
    public void multiplication() {
        System.out.print("OriginalCalculator - Enter two numbers for multiplication: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Result: " + (a * b));
    }

    public static void main(String[] args) {
        OriginalCalculator calc = new OriginalCalculator();
        calc.addition();
        calc.div();
        calc.multiplication();
    }
}