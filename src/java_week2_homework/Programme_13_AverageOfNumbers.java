package java_week2_homework;

import java.util.Scanner;

/**
 * write a java program that three numbers as input to calculate ane print the average of the numbers.
 *
 */
public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {

        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number :");
        double y = scanner.nextDouble();
        System.out.println("Enter the third number :");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x,y,z);
        // closing the scanner object
        scanner.close();
    }
    //calculation the average of three numbers
    public static void averageOfThreeNumbers(double x, double y,double z){
        double average = (x + y+ z) / 3;
        System.out.println("The average of " + x + " , " + y + " and " + z  + " is :" + average);
    }
}
