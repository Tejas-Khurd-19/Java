//  Java program to take a dividend and divisor as input from the user and calculate the remainder using the modulus operator (%):

import java.util.Scanner;

public class RemainderCalculatorusingModulus_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        int remainder = dividend % divisor;

        System.out.println("The remainder is: " + remainder);

        scanner.close();
    }
}
