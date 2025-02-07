// Write a Java program to calculate the area of a circle.
// Take radius as input from user.

import java.util.Scanner;

public class Circle_Area_01 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = 3.14 * radius * radius;

       
        System.out.println("Area of the circle: " + area);

       
        sc.close();
    }
}
