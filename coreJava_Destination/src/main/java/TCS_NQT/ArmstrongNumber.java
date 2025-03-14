package TCS_NQT;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0;
        int digits = String.valueOf(num).length(); // Count the number of digits

        while (num > 0) {
            int digit = num % 10; // Get last digit
            sum += (int) Math.pow(digit, digits); // Add the power of the digit
            num /= 10; // Remove last digit
        }

        return sum == originalNum;
    }
}
