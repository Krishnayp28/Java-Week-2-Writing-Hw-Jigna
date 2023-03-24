package java_week2_homework;

import java.util.Scanner;

/**
 * write a program to convert the upper case to lower case
 */
public class Programme_9_ConvertToUpperToLowerCase {

    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string :");
        String uppercase =scanner.nextLine();
        Programme_9_ConvertToUpperToLowerCase t = new Programme_9_ConvertToUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        scanner.close();
    }
    // convversion of uppercase to lower case method
    public void convertUppercaseToLowerCase(String text){
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}
