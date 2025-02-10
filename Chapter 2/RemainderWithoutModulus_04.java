// Java program to calculate the remainder without using the modulus (%) operator:

import java.util.Scanner;

public class RemainderWithoutModulus_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend - (quotient * divisor);

        System.out.println("The remainder is: " + remainder);

        scanner.close();
    }
}

