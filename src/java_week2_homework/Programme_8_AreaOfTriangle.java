package java_week2_homework;

import java.util.Scanner;

/**
 * write a program to calculate the area of a triangle.
 */
public class Programme_8_AreaOfTriangle {

    public static void main(String[] args) {
        // Scanner declaration for reading input from consle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the triangle :");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of the triangle :");
        int height = scanner.nextInt();
        areaOfTriangle(height, length);
        // closing the scanner object
        scanner.close();
    }
     // calculating the area of triangle with no return type with parameter method
     public static void areaOfTriangle(int length , int height){
        int area = (length * height) / 2;
         System.out.println("The Area of a triangle is : " + area);
     }
     }


