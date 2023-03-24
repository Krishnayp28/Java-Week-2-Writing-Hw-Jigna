package java_week2_homework;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 *   and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme_7_TempConversion {

    public static void main(String[] args) {
        // Scanner declaration for reading from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenhit : ");
        float temp = scanner.nextFloat();
        // object creation
        Programme_7_TempConversion  t = new Programme_7_TempConversion();
        t.convertTempoDegreeCelsius(temp);
        // closing the scanner object
        scanner.close();
    }
    // Temperature conversion method
    public void convertTempoDegreeCelsius(float temp){
         float c = ((temp - 32 ) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to" + c + " degree celsius");
    }
}
