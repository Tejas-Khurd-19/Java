// Java program to take a number as input from the user and calculate its square:

import java.util.Scanner;

public class SquareNumber_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int square = num * num;

        System.out.println("The square of " + num + " is: " + square);

        scanner.close();
    }
}
